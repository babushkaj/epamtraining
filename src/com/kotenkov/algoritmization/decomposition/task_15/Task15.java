package com.kotenkov.algoritmization.decomposition.task_15;

public class Task15 {

    private static boolean isIncreasing(int number){
        boolean isIncreasing = true;
            do{
                if(!((number % 10) > ((number/10) % 10))){
                    isIncreasing = false;
                    break;
                } else {
                    number = number/10;
                }
            } while (number > 9);
        return isIncreasing;
    }

    public static void doTask15(int amountOfDigitsInNumber){

        if(amountOfDigitsInNumber > 9){

            System.out.println("Максимальное число, с которым работает данный алгоритм, равно " +
                               Integer.MAX_VALUE + ". Пожалуйста, понизьте порядок обрабатываемых чисел и " +
                                "перезапустите программу.");

        } else {

            int theFirstNumber = (int) Math.pow(10, amountOfDigitsInNumber - 1);
            int theLastNumber = (int) Math.pow(10, amountOfDigitsInNumber);

            for (int i = theFirstNumber; i < theLastNumber; i++) {

                if(isIncreasing(i)){
                    System.out.print(i + "\t");

                }

            }

        }

    }

}
