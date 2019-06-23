package com.kotenkov.algoritmization.one_dimensional_array.task_4;

import java.util.Random;

public class Task4 {

    private int n;
    private double [] array;
    private int indexMin;
    private int indexMax;

    public Task4(int n) {
        this.n = n;
    }

    public void createRandomArray(){
        array = new double [n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array [i] = random.nextDouble();
        }
    }

    public void doTask4(){
        indexMin = 0;
        indexMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexMax]){
                indexMax = i;
            } else if (array[i] < array[indexMin]){
                indexMin = i;
            }
        }
        double tmp = array[indexMin];
        array[indexMin] = array[indexMax];
        array[indexMax] = tmp;
    }

    public void printArray(){
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array [i] + "\t");
        }
        System.out.print(" ]\n");
    }

}
