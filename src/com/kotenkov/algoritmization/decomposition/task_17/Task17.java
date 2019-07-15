package com.kotenkov.algoritmization.decomposition.task_17;

//  Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
//  действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

public class Task17 {

    private static int calculateSumOfDigits(int number){
        int sum = 0;
        do{
            sum += number % 10;
            number = number / 10;
        } while (number != 0);
        return sum;
    }

    private static int substractSumOfDigits(int number){
        return number - calculateSumOfDigits(number);
    }

    private static void doTask17(int number){
        int count = 0;
        while (number > 0){
            System.out.println(number);
            number = substractSumOfDigits(number);
            count++;
        }
        System.out.println("Количество необходимых повторений: " + count);
    }

    public static void main(String[] args) {

        Task17.doTask17(205);

    }

}
