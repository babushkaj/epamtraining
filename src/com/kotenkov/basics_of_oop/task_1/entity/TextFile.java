package com.kotenkov.basics_of_oop.task_1.entity;

public class TextFile extends File {

    private StringBuilder content;

    TextFile(FileType type, String name, int size, String content){
        super(type, name, size);
        this.content = new StringBuilder(content);
    }

    @Override
    public void printContent(){
        if(!(content.length() == 0)){
            System.out.println("\n------- printing content... -------\n");
            System.out.println(content.toString());
        } else {
            System.out.println("\nThis file is empty.");
        }
    }

    @Override
    public void addContent(String newContent){
        content.append(newContent);
    }

    @Override
    public void deleteAllContent() {
        content.delete(0, content.length());
    }

}