package com.kotenkov.algoritmization.sort.task_7;

public class Task7 {

    private static int [] findPositions(int [] arrayOne, int [] arrayTwo){
        int [] arrayOfPositions = new int [arrayTwo.length];
        int i = 0;
        int j = 0;
        while(i < arrayOne.length && j < arrayTwo.length){
            if(arrayOne[i] <= arrayTwo[j]){
                i++;
            } else {
                arrayOfPositions[j] = i;
                j++;
            }
        }

        while (j < arrayTwo.length){
            arrayOfPositions[j] = i;
            j++;
        }

        return arrayOfPositions;
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

    private static void printResult(int [] result, int [] arrayOne){
        for (int i = 0; i < result.length; i++) {
            if(result[i] == 0){
                System.out.println((i+1) + "-й элемент второй последовательности будет находиться" +
                        " перед 1-м элементом первой последовательности.");
            } else if (result[i] < arrayOne.length){
                System.out.println((i+1) + "-й элемент второй последовательности будет находиться" +
                        " между " + result[i] + "-м и " + (result[i]+1) +
                        "-м элементами первой последовательности.");
            } else {
                System.out.println((i+1) + "-й элемент второй последовательности будет находиться" +
                        " после последнего элемента первой последовательности.");
            }
        }
        System.out.println("\n");
    }

    public static void doTask7(int [] arrayOne, int [] arrayTwo){
        int [] array = findPositions(arrayOne, arrayTwo);
        if(checkArray(arrayOne) && checkArray(arrayTwo)){
            printResult(array, arrayOne);
        } else {
            System.out.println("Исходные последовательности должны быть неубывающими." +
                    " Проверьте исходные данные и перезапустите программу.");
        }
    }

}
