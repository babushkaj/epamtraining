package com.kotenkov.algoritmization.one_dimensional_array.task_2;

//      Дана последовательность действительных чисел а1 ,а2 ,..., ап.
//      Заменить все ее члены, большие данного Z, этим числом.
//      Подсчитать количество замен.

import java.util.Random;

public class Task2 {

    private int n;
    private int z;
    private int [] array;
    private int count;


    public Task2(int n, int z) {
        if(n <= 0){
            this.n = 5;
        } else {
            this.n = n;
        }
        this.z = z;
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

    private void doTask2(){
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z){
                array[i] = z;
                count++;
            }
        }
    }

    public static void main(String[] args) {

        Task2 t2 = new Task2(10, 10000000);
        t2.createRandomArray();
        System.out.println("Исходный массив: ");
        t2.printArray();
        t2.doTask2();
        System.out.println("Массив после замены чисел: ");
        t2.printArray();
        System.out.println("Количество замен: " + t2.count);

    }
}
