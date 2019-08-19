package com.kotenkov.basics_of_software_code_development.linear_program;

//  Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//  ((sin x + cos y)/(cos x - sin x))*tg xy

public class Task3 {

    private static double doTask3(double x, double y){
        double result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);

        return result;
    }

    public static void main(String[] args) {
        double x = Math.PI / 6;
        double y = Math.PI / 3;

        double result = doTask3(x,y);

        System.out.println("\nРезультат вычисления выражения: " + result);
    }

}
