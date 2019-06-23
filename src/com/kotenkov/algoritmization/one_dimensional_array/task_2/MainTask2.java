package com.kotenkov.algoritmization.one_dimensional_array.task_2;

//      Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//      числом. Подсчитать количество замен.

public class MainTask2 {

    public static void main(String[] args) {

        Task2 t2 = new Task2(10, 10000000);
        t2.createRandomArray();
        System.out.println("Исходный массив: ");
        t2.printArray();
        t2.doTask2();
        System.out.println("Массив после замены чисел: ");
        t2.printArray();
        System.out.println("Количество замен: " + t2.getCount());

    }

}
