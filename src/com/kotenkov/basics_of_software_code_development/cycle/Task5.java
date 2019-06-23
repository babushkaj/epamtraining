package com.kotenkov.basics_of_software_code_development.cycle;

public class Task5 {
    public static void main(String[] args) {
        double e = 0.00748;
        double sum = 0;
        int i = 1;

        //первый член ряда
        double temp = 1 / (Math.pow(2, i)) + 1 / (Math.pow(3, i));

        while(Math.abs(temp) >= e){
            sum += temp;
            i++;
            temp = 1 / (Math.pow(2, i)) + 1 / (Math.pow(3, i));
        }

        System.out.println("Сумма членов ряда, модуль которых больше, чем e = " + e + ", равна " + sum);
    }
}
