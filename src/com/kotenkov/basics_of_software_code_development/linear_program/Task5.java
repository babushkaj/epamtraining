package com.kotenkov.basics_of_software_code_development.linear_program;

//  Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
//  Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
//  ННч ММмин SSc.

public class Task5 {

    private static void doTask5(long timeInSeconds){
        long hours = 0;
        long mins = 0;
        long secs = 0;

        hours = timeInSeconds / 3600;
        mins = (timeInSeconds - hours * 3600) / 60;
        secs = (timeInSeconds - hours * 3600 - mins * 60);

        System.out.printf("%02dч %02dмин %02dс", hours, mins, secs);
    }

    public static void main(String[] args) {

        long timeInSeconds = 7492;

        doTask5(timeInSeconds);

    }
}
