package com.kotenkov.algoritmization.decomposition.task_10;

//  Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
//  являются цифры числа N.

public class Task10 {

    private static int calculateLength(int number){
        int length = 0;
        do{
            number = number/10;
            length++;
        } while (number != 0);
        return length;
    }

    private static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
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

    private static void doTask10(int number){
        if(number > 0) {
            int[] array = makeArray(number);
            System.out.println("Массив из цифр числа " + number + ":\n");
            printArray(array);
        } else {
            System.out.println("По условию n - натуральное число. Проверьте введённые данные и перезапустите программу.");
        }
    }

    public static void main(String[] args) {

        Task10.doTask10(108008);

    }

}
