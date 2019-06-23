package com.kotenkov.basics_of_software_code_development.cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws IOException {
        String data = null;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Введите какие-нибудь символы: ");
            data = input.readLine();
            if(!data.isEmpty()) {
                break;
            } else {
                System.out.println("Вы ничего не ввели! Повторите ввод!");
            }
        }

        char [] symbols = data.toCharArray();

        System.out.println("symbol\tcode");
        for (int i = 0; i < symbols.length; i++) {
            System.out.printf("\"%c\"\t\t%d\n", symbols[i], (int) symbols[i]);
        }
    }
}
