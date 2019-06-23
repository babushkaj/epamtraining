package com.kotenkov.algoritmization.one_dimensional_array.task_4;

//      Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class MainTask4 {

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
