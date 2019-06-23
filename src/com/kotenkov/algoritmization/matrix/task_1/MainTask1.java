package com.kotenkov.algoritmization.matrix.task_1;

//  Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class MainTask1 {

    public static void main(String[] args) {

        Task1 t1 = new Task1(3, 6);
        t1.createRandomMatrix();
        System.out.println("Исходная матрица: ");
        t1.printMatrix();
        t1.doTask1();

    }

}
