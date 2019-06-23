package com.kotenkov.algoritmization.one_dimensional_array.task_1;

//      В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class MainTask1 {

    public static void main(String[] args) {

        Task1 t1 = new Task1(10, 10);
        t1.createRandomArray();
        t1.printArray();
        t1.doTask1();

    }

}
