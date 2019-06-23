package com.kotenkov.basics_of_software_code_development.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args) throws IOException {
        int m = 0;
        int n = 0;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Введите натуральное число: ");
            String line = input.readLine();
            try{
                m = Integer.parseInt(line);
                if(m > 0) {
                    break;
                } else {
                    System.out.println("Вы ввели не натуральное число! Повторите ввод!");
                }
            } catch (NumberFormatException e){
                System.out.println("Вы ввели не натуральное число! Повторите ввод!");
                continue;
            }
        }


        while (true) {
            System.out.println("Введите целое число больше m = " + m +": ");
            String line = input.readLine();
            try {
                n = Integer.parseInt(line);
                if (n > m) {
                    break;
                } else {
                    System.out.println("Вы ввели число не большее, чем m = " + m + " Повторите ввод!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не целое число! Повторите ввод!");
                continue;
            }
        }

        System.out.println("Выводим все делители, кроме единицы и самого числа, для всех чисел в промежутке от m = " +
                           m + " до n = " + n + ": ");

        for (int i = m; i < n; i++) {
            for (int j = 2; j < i; j++) {
                if (i%j == 0){
                    System.out.println(j + " является делителем для числа " + i);
                }
            }
        }
    }
}
