package com.kotenkov.algoritmization.one_dimensional_array.task_3;

//      Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//      положительных и нулевых элементов.

public class MainTask3 {

    public static void main(String[] args) {

        Task3 t3 = new Task3(7);
        t3.createRandomArray();
        System.out.println("Массив: ");
        t3.printArray();
        t3.doTask3();
        t3.showResult();

    }

}
