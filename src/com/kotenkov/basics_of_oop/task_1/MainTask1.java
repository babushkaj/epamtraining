package com.kotenkov.basics_of_oop.task_1;

//  Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
//  вывести на консоль содержимое, дополнить, удалить.


import com.kotenkov.basics_of_oop.task_1.entity.Directory;
import com.kotenkov.basics_of_oop.task_1.entity.FileType;

public class MainTask1 {

    public static void main(String[] args) {
        Directory dir = new Directory("Directory");
        dir.createTextFile(FileType.TXT,"TextFile1", 100, "The content of the first text file.");
        dir.createTextFile(FileType.TXT,"TextFile2", 200, "The content of the second text file.");
        dir.createTextFile(FileType.TXT,"TextFile3", 300, "The content of the third text file.");
        dir.createTextFile(FileType.TXT,"TextFile4", 400, "The content of the fourth text file.");

        dir.showAllFiles();

        //deleting files
        dir.deleteFile(dir.getFile(1));
        dir.deleteFile("TextFile4", FileType.TXT);

        //the attempt to delete the same file again
        dir.deleteFile("TextFile4", FileType.TXT);

        dir.showAllFiles();

        //create files again
        dir.createTextFile(FileType.TXT,"TextFile1", 100, "The content of the first text file.");
        dir.createTextFile(FileType.TXT,"TextFile4", 400, "The content of the fourth text file.");

        dir.showAllFiles();

        //the attempt to create a file with the same name and type
        dir.createTextFile(FileType.TXT,"TextFile1", 777, "The file wouldn't be added.");

        //rename file
        dir.renameFile(dir.getFile(1),"NewNameOfFile");

        dir.showAllFiles();

        //rename file by name
        dir.renameFile(dir.getFile("NewNameOfFile"), "TextFile2");

        dir.showAllFiles();

        //the attempt to rename an existed file (using existed name)
        dir.renameFile(dir.getFile(2),"TextFile2");

        dir.getFile("TextFile2").printContent();
        dir.getFile("TextFile2").addContent(" New added content.");
        dir.getFile("TextFile2").printContent();
        dir.getFile("TextFile2").deleteAllContent();
        dir.getFile("TextFile2").printContent();

    }

}
