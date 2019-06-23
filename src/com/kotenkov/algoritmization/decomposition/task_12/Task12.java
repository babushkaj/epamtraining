package com.kotenkov.algoritmization.decomposition.task_12;

public class Task12 {

    private static int calculateNumbersSum(int n){
        int sum = 0;
        while (n != 0){
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    private static int findNumbersQuantity(int k, int n){
        int amount = 0;
        for (int i = 1; i <= n; i++) {
            if(calculateNumbersSum(i) == k && i < n){
                amount++;
            }
        }
        return amount;
    }
    
    public static int [] doTask12 (int k, int n){
        int [] array = new int [findNumbersQuantity(k, n)];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (calculateNumbersSum(i) == k && i < n){
                array [index] = i;
                index++;
            }
        }
        return array;
    }

    public static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

}
