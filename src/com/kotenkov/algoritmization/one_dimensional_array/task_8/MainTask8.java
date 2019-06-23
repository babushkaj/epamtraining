package com.kotenkov.algoritmization.one_dimensional_array.task_8;

//       Дана последовательность целых чисел a1, a2, ... , an. Образовать новую последовательность,
//       выбросив из исходной те члены, которые равны min(a1, a2, ... , an).

public class MainTask8 {

    public static void main(String[] args) {

        Task8 t8 = new Task8(10);
        t8.createRandomArray();
        System.out.println("Исходная последовательность: ");
        t8.printArray();
        t8.doTask8();

    }

}
