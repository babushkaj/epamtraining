package com.kotenkov.basics_of_software_code_development.linear_program;

//  Найдите значение функции: z = ( (a – 3) * b / 2) + c.

public class Task1 {

    private static double doTask1(double a, double b, double c){
        return ((a - 3) * b / 2) + c;
    }

    public static void main(String[] args) {
        double a = 4;
        double b = 3;
        double c = 2;
        double result = doTask1(a,b,c);
        System.out.println("\nРезультат вычисления выражения: " + result);
    }

}
