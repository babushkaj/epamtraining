package com.kotenkov.basics_of_software_code_development.linear_program;

public class Task2 {
    public static void main(String[] args) {
        double a = 1;
        double b = 1;
        double c = 1;
        System.out.println("Результат вычисления выражения: "
                            + (((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a))
                            - Math.pow(a, 3) * c + Math.pow(b, -2)));
    }

}
