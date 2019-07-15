package com.kotenkov.basics_of_software_code_development.cycle;

//  Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
//  модуль которых больше или равен заданному е. Общий член ряда имеет вид:
//  an = 1/2^n + 1/3^n

public class Task5 {

    private static double doTask5(double e){
        double sum = 0;
        int i = 1;

        //в переменную для i-го члена ряда заносим значение первого члена ряда
        double temp = 1 / (Math.pow(2, i)) + 1 / (Math.pow(3, i));

        while(Math.abs(temp) >= e){
            sum += temp;
            i++;
            temp = 1 / (Math.pow(2, i)) + 1 / (Math.pow(3, i));
        }

        return sum;

    }
    public static void main(String[] args) {

        double e = 0.0748;
        double sum = doTask5(e);
        System.out.println("Сумма членов ряда, модуль которых больше, чем e = " + e + ", равна " + sum);

    }
}
