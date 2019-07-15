package com.kotenkov.algoritmization.decomposition.task_8;

//  Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//  Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
//  массива с номерами от k до m.

public class Task8 {

    private static int[] createRandomArray(int n){
        int [] array = new int [n];
        for (int i = 0; i < array.length; i++) {
            array [i] = (int)(Math.random()*10);
        }
        return array;
    }

    private static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    private static int calculateSumOfThree(int theFirstElement, int [] array){
        int sum = 0;
        for (int i = theFirstElement; i < theFirstElement + 3; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static void doTask8(int k){
        int [] array = createRandomArray(10);

        if(k < 0 || k > array.length - 3){
            System.out.println("Проверьте значение k. Для корректной работы должны выполняться условия: " +
                    "k > 0, k <= " + (array.length - 3));
        } else {
            System.out.println("Массив (нумерация элементов начинается с 0:");
            printArray(array);
            System.out.println("Сумма " + k + ", " + (k+1) + ", " + (k+2) + " элементов массива равна " +
                                calculateSumOfThree(k, array));
        }

    }

    public static void main(String[] args) {

        doTask8(5);

    }

}
