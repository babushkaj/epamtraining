package com.kotenkov.algoritmization.one_dimensional_array.task_10;

public class Task10 {

    private int n;
    private int [] array;

    public Task10(int n) {
        this.n = n;
    }

    public void createRandomArray(){
        array = new int [n];
        for (int i = 0; i < array.length; i++) {
            array [i] = (int)(Math.random()*10 + 1);
        }
    }

    public void doTask10(){
        for (int i = 0; i < array.length; i++) {
            if(i % 2 != 0){
                array[i] = 0;
            }
        }

        if(array.length > 2){
            for (int i = 2; i < array.length; i += 2) {
                int tmp = array[i];
                array[i] = array[i - i/2];
                array[i - i/2] = tmp;
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
