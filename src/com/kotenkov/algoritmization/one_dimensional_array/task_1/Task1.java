package com.kotenkov.algoritmization.one_dimensional_array.task_1;

import java.util.Random;

public class Task1 {

    private int n;
    private int k;
    private int [] array;
    private long sum;

    public Task1(int n, int k) {
        this.n = n;
        this.k = k;
    }

    public void createRandomArray(){
        array = new int [n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array [i] = random.nextInt();
            //System.out.println(array[i]);
        }
    }

    public void doTask1(){
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0){
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    public void printArray(){
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array [i] + "\t");
        }
        System.out.print(" ]\n");
    }

}
