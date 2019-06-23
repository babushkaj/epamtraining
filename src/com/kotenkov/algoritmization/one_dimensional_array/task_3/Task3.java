package com.kotenkov.algoritmization.one_dimensional_array.task_3;

public class Task3 {

    private int n;
    private int positive;
    private int negative;
    private int zero;
    private double [] array;

    public Task3(int n) {
        this.n = n;
    }

    public void createRandomArray(){
        array = new double [n];
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 5 == 0){
                array [i] = 0;
            } else{
                array [i] = Math.random()*9 - 4;
            }
        }
    }

    public void doTask3(){
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0){
                positive++;
            } else if (array[i] < 0){
                negative++;
            } else{
                zero++;
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
        System.out.println("Количество положительных чисел в массиве: " + positive);
        System.out.println("Количество отрицательных чисел в массиве: " + negative);
        System.out.println("Количество нулей в массиве: " + zero);
    }

}
