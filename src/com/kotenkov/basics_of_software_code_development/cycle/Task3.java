package com.kotenkov.basics_of_software_code_development.cycle;

//  Найти сумму квадратов первых ста чисел

public class Task3 {

    private static int doTask3(int n){
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum+=i*i;
        }

        return sum;
    }

    public static void main(String[] args) {

        int sum = doTask3(100);
        System.out.println("Сумма квадратов первых ста чисел равна: " + sum);

    }
}
