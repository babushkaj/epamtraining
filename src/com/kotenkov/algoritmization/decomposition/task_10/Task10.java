package com.kotenkov.algoritmization.decomposition.task_10;

public class Task10 {

    private static int calculateLength(int number){
        int length = 0;
        do{
            number = number/10;
            length++;
        } while (number != 0);
        return length;
    }

    private static int [] makeArray(int number){
        int [] array = new int [calculateLength(number)];
        int arraysLength = calculateLength(number);
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (number / Math.pow(10, (arraysLength - i - 1)));
            number = number % ((int) Math.pow(10, (arraysLength - i - 1)));
        }
        return array;
    }

    public static void doTask10(int number){
        int [] array = makeArray(number);
        System.out.println("Массив из цифр числа " + number + ":\n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

}
