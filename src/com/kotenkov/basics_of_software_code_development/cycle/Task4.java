package com.kotenkov.basics_of_software_code_development.cycle;

import java.math.BigInteger;

public class Task4 {
    public static void main(String[] args) {
        BigInteger result = new BigInteger("1");

        for (int i = 1; i <= 200; i++) {
            int temp = i * i;
            BigInteger bigTemp = BigInteger.valueOf(temp);
            result = result.multiply(bigTemp);
        }

        System.out.println("Произведение квадратов первых двухсот чисел равно: " + result);
    }
}
