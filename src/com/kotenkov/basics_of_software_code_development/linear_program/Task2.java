package com.kotenkov.basics_of_software_code_development.linear_program;

//  Вычислить значение выражения по формуле (все переменные принимают действительные значения
//  (b + sqrt(b^2 + 4ac))/2a - a^3*c + b^-2

public class Task2 {

    private static double doTask2(double a, double b, double c){
        double result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)
                         - Math.pow(a, 3) * c + Math.pow(b, -2);

        return result;
    }

    public static void main(String[] args) {
        double a = 1;
        double b = 1;
        double c = 1;
        double result = doTask2(a,b,c);
        System.out.println("\nРезультат вычисления выражения: " + result);
    }

}
