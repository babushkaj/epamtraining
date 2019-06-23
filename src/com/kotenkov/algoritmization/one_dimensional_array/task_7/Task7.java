package com.kotenkov.algoritmization.one_dimensional_array.task_7;

public class Task7 {

    private int n;
    private double [] array;
    private double max;

    public Task7(int n) {
        this.n = n;
    }

    public void createRandomArray(){
        array = new double [n];
        for (int i = 0; i < array.length; i++) {
            array [i] = Math.random()*10;
        }
    }

    public void doTask7(){
        max = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length/2; i++) {
            if(array[i] + array[array.length - i - 1] > max){
                max = array[i] + array[array.length - i - 1];
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

    public void showResult(){
        System.out.println("max(a1 + a2n, a2 + a2n-1 , ... , an + an+1): " + max);
    }

}
