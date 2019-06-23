package com.kotenkov.algoritmization.decomposition.task_17;

public class Task17 {

    private static int calculateSumOfDigits(int number){
        int sum = 0;
        do{
            sum += number % 10;
            number = number / 10;
        } while (number !=0 );
        return sum;
    }

    private static int substractSumOfDigits(int number){
        return number - calculateSumOfDigits(number);
    }

    public static void doTask17(int number){
        int count = 0;
        while (number > 0){
            number = substractSumOfDigits(number);
            count++;
        }
        System.out.println("Количество необходимых повторений: " + count);
    }

}
