package com.kotenkov.basics_of_software_code_development.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        int value = 0;
        int result = 0;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Введите целое положительное число: ");
            String line = input.readLine();
            try{
                value = Integer.parseInt(line);
                if (value > 0) {
                    System.out.println("Вы ввели число " + value);
                    break;
                } else {
                    System.out.println("Вы ввели отрицательно число! Повторите ввод!");
                }
            } catch (NumberFormatException e){
                System.out.println("Вы ввели не целое число! Повторите ввод!");
                continue;
            }
        }
        input.close();

        for (int i = 1; i <= value; i++) {
            result += i;
        }

        System.out.println("Сумма чисел от 1 до " + value + " (включительно) равна " + result + "." );
    }
}
