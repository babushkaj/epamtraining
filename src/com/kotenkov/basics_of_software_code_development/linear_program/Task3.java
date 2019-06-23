package com.kotenkov.basics_of_software_code_development.linear_program;

public class Task3 {
    public static void main(String[] args) {
        double x = Math.PI / 6;
        double y = Math.PI / 3;

        System.out.println("Результат вычисления выражения: "
                + ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y));
    }

}
