package com.kotenkov.algoritmization.one_dimensional_array.task_9;

//     В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//     чисел несколько, то определить наименьшее из них.


public class MainTask9 {

    public static void main(String[] args) {

        Task9 t9 = new Task9(10);
        t9.createRandomArray();
        System.out.println("Исходная последовательность: ");
        t9.printArray();
        t9.doTask9();
        t9.printMarkersArray();
        t9.showResult();

    }

}
