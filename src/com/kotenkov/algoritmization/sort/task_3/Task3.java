package com.kotenkov.algoritmization.sort.task_3;

public class Task3 {

    private static void swap(int [] array, int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private static int [] findMax(int [] array, int i){
        int max = array[i];
        int indexMax = i;
        for (int j = i + 1; j < array.length; j++) {
            if(array[j] > max){
                max = array[j];
                indexMax = j;
            }
        }
        int [] result = {max, indexMax};
        return result;
    }

    private static int doSort(int [] array){
        int swapCounter = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int max = findMax(array, i)[0];
            int indexMax = findMax(array, i)[1];
            if (array[i] != max){
                swap(array, i, indexMax);
                swapCounter++;
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

    public static void doTask3(int [] array){
        System.out.println("Исходная последовательность:\n");
        printArray(array);
        int swapCount = doSort(array);
        System.out.println("Последовательность после сортировки:\n");
        printArray(array);
        System.out.println("Количество перестановок: " + swapCount);
    }

}
