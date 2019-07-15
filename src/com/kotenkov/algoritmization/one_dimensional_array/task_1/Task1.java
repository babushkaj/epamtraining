package com.kotenkov.algoritmization.one_dimensional_array.task_1;

//  В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

import java.util.Random;

public class Task1 {

    private int n;
    private int k;
    private int [] array;
    private long sum;

    public Task1(int n, int k) {
        if(n <= 0){
            this.n = 5;
        } else {
            this.n = n;
        }

        this.k = k;
    }

    private void createRandomArray(){
        array = new int [n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array [i] = random.nextInt();
        }
    }

    private void printArray(){
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array [i] + "\t");
        }
        System.out.print(" ]\n");
    }

    private void doTask1(){
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0){
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        Task1 t1 = new Task1(10, 10);
        t1.createRandomArray();
        t1.printArray();
        t1.doTask1();

    }

}
