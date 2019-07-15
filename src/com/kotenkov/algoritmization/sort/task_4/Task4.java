package com.kotenkov.algoritmization.sort.task_4;

//  Сортировка обменами. Дана последовательность чисел a1, a2, ... ,an. Требуется переставить числа в
//  порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1. Если ai > ai+1, то
//  делается перестановка. Так продолжается до тех пор, пока все элементы не станут расположены
//  в порядке возрастания. Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

public class Task4 {

    private static void swap(int [] array, int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private static int doSort(int [] array){
        int swapCounter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i -1; j++) {
                if(array[j] > array[j+1]){
                    swap(array, j, j+1);
                    swapCounter++;
                }
            }
        }
        return swapCounter;
    }


    private static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\n");
    }

    public static void doTask4(int [] array){
        System.out.println("Исходная последовательность:\n");
        printArray(array);
        int swapCount = doSort(array);
        System.out.println("Последовательность после сортировки:\n");
        printArray(array);
        System.out.println("Количество перестановок: " + swapCount);
    }

}
