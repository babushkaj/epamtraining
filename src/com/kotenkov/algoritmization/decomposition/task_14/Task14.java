package com.kotenkov.algoritmization.decomposition.task_14;

//  Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
//  возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
//  использовать декомпозицию.

public class Task14 {

    private static int calculateLengthOfNumber(int number){
        int length = 0;
        do{
            number = number/10;
            length++;
        } while (number != 0);
        return length;
    }

    private static int findNumbersSum(int number){
        int length = calculateLengthOfNumber(number);
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

    private static void doTask14(int k){
        if(k > 1){
            System.out.println("Числа Армстронга в диапазоне от 1 до " + k + ": ");
            for (int i = 1; i <= k; i++) {
                if(isArmstrongsNumber(i)){
                    System.out.print(i + "\t");
                }
            }
        }else{
            System.out.println("По условию k - натуральное число больше единицы." +
                    " Проверьте введённые данные и перезапустите программу.");
        }

    }

    public static void main(String[] args) {

        Task14.doTask14(1000000);

    }
}
