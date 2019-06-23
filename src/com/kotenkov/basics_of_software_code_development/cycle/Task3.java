package com.kotenkov.basics_of_software_code_development.cycle;

public class Task3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum+=i*i;
        }

        System.out.println("Сумма квадратов первых ста чисел равна: " + sum);
    }
}
