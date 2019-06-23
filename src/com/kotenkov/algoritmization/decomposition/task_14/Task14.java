package com.kotenkov.algoritmization.decomposition.task_14;

public class Task14 {

    private static int calculateNumbersLength(int number){
        int length = 0;
        do{
            number = number/10;
            length++;
        } while (number != 0);
        return length;
    }

    private static int findNumbersSum(int number){
        int length = calculateNumbersLength(number);
        int numbersSum = 0;
        do{
            numbersSum += Math.pow((number%10), length);
            number = number/10;
        } while (number != 0);
        return numbersSum;
    }

    private static boolean isArmstrongsNumber(int number){
        if(number == findNumbersSum(number)){
            return true;
        } else {
            return false;
        }
    }

    public static void doTask14(int k){
        System.out.println("Числа Армстронга в диапазоне от 1 до " + k + ": ");
        for (int i = 1; i <= k; i++) {
            if(isArmstrongsNumber(i)){
                System.out.print(i + "\t");
            }
        }
    }

}
