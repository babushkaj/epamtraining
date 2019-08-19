package com.kotenkov.basics_of_software_code_development.cycle;

//  Для каждого натурального числа в промежутке от m до n вывести все делители,
//  кроме единицы и самого числа. m и n вводятся с клавиатуры

import java.util.Scanner;

public class Task7 {

    private static int getM(Scanner scanner){
        int m = 0;

        while (true) {
            System.out.println("\nВведите натуральное число:");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("\nВведите натуральное число:");
            }

            m = scanner.nextInt();

            if (m > 0) {
                break;
            }
        }

        return m;
    }

    private static int getN(Scanner scanner, int m){
        int n = m;

        while (n <= m) {
            System.out.println("\nВведите натуральное число, большее, чем m = " + m + ":");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("\nВведите натуральное число, большее, чем m = " + m + ":");
            }

            n = scanner.nextInt();

            if (n > m) {
                break;
            }
        }

        return n;
    }

    private static void doTask7(){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        int m = getM(scanner);
        int n = getN(scanner, m);

        System.out.println("Выводим все делители, кроме единицы и самого числа," +
                           " для всех чисел в промежутке от m = " +
                           m + " до n = " + n + ": ");

        for (int i = m; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i%j == 0){
                    System.out.println(j + " является делителем для числа " + i);
                }
            }
        }
    }

    public static void main(String[] args){

        doTask7();

    }
}
