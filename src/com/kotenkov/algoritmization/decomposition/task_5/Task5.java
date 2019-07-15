package com.kotenkov.algoritmization.decomposition.task_5;

//  Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//  которое меньше максимального элемента массива, но больше всех других элементов).

public class Task5 {

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

    private static int findMaxNumber(int [] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    private static int findTheSecondNumber(int [] array){
        int theSecondNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > theSecondNumber && array[i] < findMaxNumber(array)){
                theSecondNumber = array[i];
            }
        }
        return theSecondNumber;
    }

    public static void main(String[] args) {

        int [] matrix = Task5.createRandomArray(7);
        Task5.printArray(matrix);
        System.out.println("Второе по величине число в массиве: " +
                Task5.findTheSecondNumber(matrix));

    }

}
