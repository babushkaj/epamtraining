package com.kotenkov.basics_of_software_code_development.linear_program;

public class Task4 {
    public static void main(String[] args) {
     double r = 101.321;
     int leftPart = (int) r;
     double temp = r * 1000;
     int rightPart = (int)(temp % 1000);
     double result = rightPart + leftPart * 0.001;

        System.out.println("Исходное число: " + r);
        System.out.println("Результат: " + result);
    }
}
