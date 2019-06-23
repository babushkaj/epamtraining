package com.kotenkov.algoritmization.one_dimensional_array.task_2;

import java.util.Random;

public class Task2 {

    private int n;
    private int z;
    private int [] array;
    private int count;


    public Task2(int n, int z) {
        this.n = n;
        this.z = z;
    }

    public void createRandomArray(){
        array = new int [n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array [i] = random.nextInt();
            //System.out.println(array[i]);
        }
    }

    public void doTask2(){
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z){
                array[i] = z;
                count++;
            }
        }
    }

    public void printArray(){
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array [i] + "\t");
        }
        System.out.print(" ]\n");
    }

    public int getCount() {
        return count;
    }

}
