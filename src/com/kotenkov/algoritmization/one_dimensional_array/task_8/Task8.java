package com.kotenkov.algoritmization.one_dimensional_array.task_8;

public class Task8 {

    private int n;
    private int [] array;

    public Task8(int n) {
        this.n = n;
    }

    public void createRandomArray(){
        array = new int [n];
        for (int i = 0; i < array.length; i++) {
            array [i] = (int)(Math.random()*10 + 1);
        }
    }

    public void doTask8(){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }

        System.out.println("Новая последовательность: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] != min){
                System.out.print(array [i] + "\t");
            }
        }
    }

    public void printArray(){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array [i] + "\t");
        }
        System.out.println();
    }
}
