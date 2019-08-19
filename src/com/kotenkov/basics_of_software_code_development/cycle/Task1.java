package com.kotenkov.basics_of_software_code_development.cycle;

//  Напишите программу, где пользователь вводит любое целое положительное число.
//  А программа суммирует все числа от 1 до введенного пользователем числа.

import java.util.Scanner;

public class Task1 {

    private static int getUsersInt(){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true) {
            System.out.println("\nВведите целое положительное число:");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("\nВведите целое положительное число:");
            }

            number = scanner.nextInt();

            if (number > 0) {
                break;
            }
        }

        return number;
    }

    private static int doTask1(int number){
        int result = 0;

        for (int i = 1; i <= number; i++) {
            result += i;
        }

        return result;
    }

    public static void main(String[] args) {
        int value = getUsersInt();
        int result = doTask1(value);
        System.out.println("Сумма чисел от 1 до " + value + " (включительно) равна " + result + "." );
    }
}
