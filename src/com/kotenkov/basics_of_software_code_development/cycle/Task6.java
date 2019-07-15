package com.kotenkov.basics_of_software_code_development.cycle;

//  Вывести на экран таблицу соответствия между символами и их численными обозначениями в памяти компьютера.

public class Task6 {

    private static void doTask6(){
        System.out.println("symbol\tcode");

        for (int i = 32; i < 127; i++) {
            System.out.printf("\"%c\"\t\t%d\n", (char) i, i);
        }
    }

    public static void main(String[] args){

        doTask6();

    }
}
