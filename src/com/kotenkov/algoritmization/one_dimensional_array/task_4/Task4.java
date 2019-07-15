package com.kotenkov.algoritmization.one_dimensional_array.task_4;

//      Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

import java.util.Random;

public class Task4 {

    private int n;
    private double [] array;
    private int indexMin;
    private int indexMax;

    private Task4(int n) {
        if(n <= 0){
            this.n = 5;
        } else {
            this.n = n;
        }
    }

    private void createRandomArray(){
        array = new double [n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array [i] = random.nextDouble();
        }
    }

    private void printArray(){
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array [i] + "\t");
        }
        System.out.print(" ]\n");
    }

    private void doTask4(){
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

    public static void main(String[] args) {

        Task4 t4 = new Task4(5);
        t4.createRandomArray();
        System.out.println("Исходный массив: ");
        t4.printArray();
        t4.doTask4();
        System.out.println("Массив после перестановки максимального и минимального элементов: ");
        t4.printArray();

    }
}
