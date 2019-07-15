package com.kotenkov.algoritmization.decomposition.task_16;

//  Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
//  Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

public class Task16 {

    private static boolean isContainOnlyOddDigits(int number){
        boolean isContainOnlyOddDigits = true;
        do{
            if(((number % 10) % 2) == 0){
                isContainOnlyOddDigits = false;
                break;
            } else {
                number = number/10;
            }
        } while (number !=0 );
        return isContainOnlyOddDigits;
    }

    private static long findSum(int amountOfDigitsInNumber) {
        if (amountOfDigitsInNumber > 9) {
            System.out.println("Максимальное число, с которым работает данный алгоритм, равно " +
                    Integer.MAX_VALUE + ". Пожалуйста, понизьте порядок обрабатываемых чисел и " +
                    "перезапустите программу.");
            return 0;
        } else {

            int theFirstNumber = (int) Math.pow(10, amountOfDigitsInNumber - 1);
            int theLastNumber = (int) Math.pow(10, amountOfDigitsInNumber);
            long sum = 0;

            for (int i = theFirstNumber; i < theLastNumber; i++){
                if(isContainOnlyOddDigits(i)){
                    sum += i;
                }
            }

            return sum;
        }
    }

    private static int countEvenDigitsAmount(long number){
        int evenDigitsAmount = 0;
        do{
            if(((number % 10) % 2) == 0){
                evenDigitsAmount++;
            }
            number = number/10;
        } while (number !=0 );
        return evenDigitsAmount;
    }

    private static void doTask16(int amountOfDigitsInNumber){

        long sum = findSum(amountOfDigitsInNumber);
        if(sum != 0){
            int evenDigitsAmount = countEvenDigitsAmount(sum);
            System.out.println("Сумма " + amountOfDigitsInNumber + "-значных чисел," +
                               " содержащих только нечётные цифры: " + sum);
            System.out.println("Количество чётных цифр в сумме: " + evenDigitsAmount);
        }

    }

    public static void main(String[] args) {

        Task16.doTask16(3);

    }
}
