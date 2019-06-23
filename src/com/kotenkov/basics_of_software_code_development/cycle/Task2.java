package com.kotenkov.basics_of_software_code_development.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        int a = 0;
        int b = 0;
        int h = 0;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Введите целое число: ");
            String line = input.readLine();
            try{
                a = Integer.parseInt(line);
                break;
            } catch (NumberFormatException e){
                System.out.println("Вы ввели не целое число! Повторите ввод!");
                continue;
            }
        }

        while (true) {
            System.out.println("Введите целое число, не равное a = " + a +": ");
            String line = input.readLine();
            try {
                b = Integer.parseInt(line);
                if (b != a) {
                    break;
                } else {
                    System.out.println("Вы ввели число, равное a = " + a + " Повторите ввод!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не целое число! Повторите ввод!");
                continue;
            }
        }

        while(true){
            if (a > b){
                System.out.println("Введите целое отрицательное число: ");
                String line = input.readLine();
                try {
                    h = Integer.parseInt(line);
                    if (b < a) {
                        break;
                    } else {
                        System.out.println("Вы ввели положительное число!" + a + " Повторите ввод!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели не целое число! Повторите ввод!");
                    continue;
                }
            } else if (a < b){
                System.out.println("Введите целое положительное число: ");
                String line = input.readLine();
                try {
                    h = Integer.parseInt(line);
                    if (b > a) {
                        break;
                    } else {
                        System.out.println("Вы ввели отрицательное число!" + a + " Повторите ввод!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели не целое число! Повторите ввод!");
                    continue;
                }
            }
        }

        input.close();
        System.out.println("Вычисляем значение функции для a = " + a + ", b = " + b + ", h = " + h + ":");
        System.out.println("x y");

        if (a < b){
            for (int x = a; x <= b; x += h) {
                if (x > 2){
                    System.out.printf("%d %d\n", x, x);
                } else {
                    System.out.printf("%d %d\n", x, -x);
                }
            }
        } else{
            for (int x = a; x >= b; x -= h) {
                if (x > 2){
                    System.out.printf("%d %d\n", x, x);
                } else {
                    System.out.printf("%d %d\n", x, -x);
                }
            }
        }

    }
}
