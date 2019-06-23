package com.kotenkov.algoritmization.sort.task_2;

public class Task2 {

    private static int [] mergeArrays(int [] arrayOne, int [] arrayTwo){
        int [] newArray = new int [arrayOne.length + arrayTwo.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < arrayOne.length && j < arrayTwo.length){
            if(arrayOne[i] <= arrayTwo[j]){
                newArray[k] = arrayOne[i];
                i++;
            } else {
                newArray[k] = arrayTwo[j];
                j++;
            }
            k++;
        }

        while (i < arrayOne.length){
            newArray[k] = arrayOne[i];
            i++;
            k++;
        }

        while (j < arrayTwo.length){
            newArray[k] = arrayTwo[j];
            j++;
            k++;
        }

        return newArray;
    }

    private static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ "\t");
        }
        System.out.println("\n");
    }

    private static boolean checkArray(int [] array){
        boolean result = true;
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] > array[i+1]){
                result = false;
                break;
            }
        }
        return result;
    }

    public static void doTask2(int [] arrayOne, int [] arrayTwo){
        int [] array = mergeArrays(arrayOne, arrayTwo);
        if(checkArray(arrayOne) && checkArray(arrayTwo)){
            System.out.println("Исходные последовательности:\n");
            printArray(arrayOne);
            printArray(arrayTwo);
            System.out.println("Новая последовательность:\n");
            printArray(array);
        } else {
            System.out.println("Исходные последовательности должны быть неубывающими." +
                               " Проверьте исходные данные и перезапустите программу.");
        }

    }

}
