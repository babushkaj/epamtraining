package com.kotenkov.algoritmization.decomposition.task_5;

public class Task5 {

    public static int[] createRandomArray(int n){
        int [] array = new int [n];
        for (int i = 0; i < array.length; i++) {
            array [i] = (int)(Math.random()*10);
        }
        return array;
    }

    public static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    private static int findMaxNumber(int [] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int findTheSecondNumber(int [] array){
        int theSecondNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > theSecondNumber && array[i] < findMaxNumber(array)){
                theSecondNumber = array[i];
            }
        }
        return theSecondNumber;
    }

}
