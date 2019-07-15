package com.kotenkov.basics_of_software_code_development.linear_program;

//  Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
//  Поменять местами дробную и целую части числа и вывести полученное значение числа.

public class Task4 {

    private static double doTask4(double number){
        int leftPart = (int) number;
        double temp = number * 1000;
        int rightPart = (int)(temp % 1000);
        double result = rightPart + leftPart * 0.001;
        return result;
    }

    public static void main(String[] args) {
        double number = 101.321;

        double result = doTask4(number);

        System.out.println("Исходное число: " + number);
        System.out.println("Результат: " + result);
    }
}
