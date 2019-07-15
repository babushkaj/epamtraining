package com.kotenkov.algoritmization.sort.task_6;

//  Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//  Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1,
//  то продвигаются на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются
//  на один элемент назад. Составить алгоритм этой сортировки.

public class Task6 {

    private static void swap(int [] array, int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private static void shift(int [] array, int j, int step){
        for (int k = j; k >= step; k-=step) {
            if(array[k] < array[k-step]){
                swap(array, k, k-step);
            }
        }
    }

    private static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\n");
    }

    private static void sortShell(int [] array){
        int step = array.length/2;
        while (step > 0){
            for (int i = 0; i < step; i++) {
                for (int j = i; j < array.length - step; j+=step) {
                    if(array[j] > array[j+step]){
                        shift(array,j+step, step);
//                        swap(array, j, j+step);
                    }
                }
            }
            step /= 2;
        }
    }

    public static void doTask6(int [] array){
        System.out.println("Массив до сортировки:");
        printArray(array);
        sortShell(array);
        System.out.println("Массив после сортировки:");
        printArray(array);
    }

}
