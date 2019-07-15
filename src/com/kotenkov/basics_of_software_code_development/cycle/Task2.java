package com.kotenkov.basics_of_software_code_development.cycle;

//  Вычислить значения функции на отрезке [а,b] c шагом h:
//  y = x при x > 2
//  y = -x при x <= 2

import java.util.Scanner;

public class Task2 {

    private static int getA(Scanner scanner){
        int a = 0;

            System.out.println("\nВведите целое число:");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("\nВведите целое число:");
            }

            a = scanner.nextInt();

        return a;
    }

    private static int getB(Scanner scanner, int a){
        int b = a;

        while (b == a) {
            System.out.println("\nВведите целое число, не равное a = " + a + ":");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("\nВведите целое число, не равное a = " + a + ":");
            }

            b = scanner.nextInt();

            if (b != a) {
                break;
            }
        }

        return b;
    }

    private static int getH(Scanner scanner, int a, int b){
        int h = 0;

        if (a < b){
            while (h <= 0) {
                System.out.println("\nВведите целое положительное число:");
                while (!scanner.hasNextInt()) {
                    scanner.next();
                    System.out.println("\nВведите целое положительное число:");
                }

                h = scanner.nextInt();

                if (h > 0) {
                    break;
                }
            }
        } else {
            System.out.println("Введите целое отрицательное число: ");
            while (h >= 0) {
                System.out.println("\nВведите целое отрицательное число:");
                while (!scanner.hasNextInt()) {
                    scanner.next();
                    System.out.println("\nВведите целое отрицательное число:");
                }

                h = scanner.nextInt();

                if (h < 0) {
                    break;
                }
            }
        }

        return h;
    }

    private static void doTask2(){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        int a = getA(scanner);
        int b = getB(scanner,a);
        int h = getH(scanner,a,b);

        System.out.println("Вычисляем значение функции для a = " + a + ", b = " + b + ", h = " + h + ":");
        System.out.println("x\t y");

        if (a < b){
            for (int x = a; x <= b; x += h) {
                if (x > 2){
                    System.out.printf("%d\t %d\n", x, x);
                } else {
                    System.out.printf("%d\t %d\n", x, -x);
                }
            }
        } else{
            for (int x = a; x >= b; x -= h) {
                if (x > 2){
                    System.out.printf("%d\t %d\n", x, x);
                } else {
                    System.out.printf("%d\t %d\n", x, -x);
                }
            }
        }
    }

    public static void main(String[] args){

        doTask2();

    }
}
