package com.kotenkov.basics_of_oop.task_1.entity;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    private String name;
    private List<File> files;

    public Directory(String name) {
        this.name = name;
        files = new ArrayList<>();
    }

    public File createTextFile(FileType type, String name, int size, String content){
        TextFile file = new TextFile(type,name, size, content);
        if(!files.contains(file)){
            files.add(file);
            file.setNumber(files.size());
            System.out.println("\nText file \"" + name + "\" has been created.");
            return file;
        } else {
            System.out.println("\nThe file with the same name" +
                               " and type has already existed. File hasn't been created.");
            return null;
        }
    }

    public void deleteFile(File file){
        if(files.contains(file)){
            files.remove(file);
            System.out.println("\nFile \"" + file.getName() +"\" has been deleted!");
            for (int i = 0; i < files.size(); i++) {
                files.get(i).setNumber(i+1);
            }
        } else {
            System.out.println("\nThe file hasn't been found and deleted.");
        }
    }

    public void deleteFile(String name, FileType type){
        for (int i = 0; i < files.size(); i++) {
            File f = files.get(i);
            if(f.getName().equals(name) && f.getType() == type){
                deleteFile(f);
                return;
            }
        }

        System.out.println("\nThe file hasn't been found and deleted.");
    }

    public void renameFile(File file, String newName){
        if(!findFileByNameAndType(newName, file.getType())){
            System.out.println("\nThe file \"" + file.getName() + "\" has been renamed to \"" + newName + "\"!");
            file.setName(newName);
        } else {
            System.out.println("\nThe file can't be renamed," +
                               " cause file with the same name and type has already existed.");
        }
    }

    public File getFile(int number){
        for (File f: files) {
            if(f.getNumber() == number){
                return f;
            }
        }
        return null;
    }

    public File getFile(String name){
        for (File f: files) {
            if(f.getName().equals(name)){
                return f;
            }
        }
        return null;
    }

    public void showAllFiles(){
        if(!files.isEmpty()){
            System.out.printf("\n%-4s%-20s%-8s\n", "N", "Name", "Size");
            System.out.println("--------------------------------");
            for (File f: files) {
                System.out.printf("%-4d%-20s%-8d\n", f.getNumber(), f.getName(), f.getSize());
            }
        } else {
            System.out.println("\nThere is no files in the  directory.");
        }
    }

    private boolean findFileByNameAndType(String name, FileType type){
        for (File f: files) {
           if(f.getName().equals(name) && f.getType() == type) {
               return true;
           }
        }
        return false;
    }

}
