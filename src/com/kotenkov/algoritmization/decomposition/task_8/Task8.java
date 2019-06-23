package com.kotenkov.algoritmization.decomposition.task_8;

public class Task8 {

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



}
