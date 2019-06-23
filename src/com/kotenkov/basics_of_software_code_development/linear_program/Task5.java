package com.kotenkov.basics_of_software_code_development.linear_program;

public class Task5 {


    public static void main(String[] args) {
        long t = 7492;
        long hours = 0;
        long mins = 0;
        long secs = 0;
        hours = t / 3600;
        mins = (t - hours * 3600) / 60;
        secs = (t - hours * 3600 - mins * 60);
        System.out.printf("%02dч %02dмин %02dс", hours, mins, secs);
    }
}
