package com.kotenkov.basics_of_software_code_development.cycle;

//  Составить программу нахождения произведения квадратов первых двухсот чисел.

import java.math.BigInteger;

public class Task4 {

    private static BigInteger doTask4(int n){
        BigInteger result = new BigInteger("1");

        for (int i = 1; i <= n; i++) {
            int temp = i * i;
            BigInteger bigTemp = BigInteger.valueOf(temp);
            result = result.multiply(bigTemp);
        }

        return result;
    }

    public static void main(String[] args) {

        BigInteger result = doTask4(200);
        System.out.println("Произведение квадратов первых двухсот чисел равно: " + result);

    }
}
