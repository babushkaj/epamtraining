package com.kotenkov.algoritmization.one_dimensional_array.task_5;

//      Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class MainTask5 {

    public static void main(String[] args) {

        Task5 t5 = new Task5(5);
        t5.createRandomArray();
        System.out.println("Массив: ");
        t5.printArray();
        t5.doTask5();

    }

}
