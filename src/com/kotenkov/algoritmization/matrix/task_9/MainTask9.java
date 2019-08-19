package com.kotenkov.algoritmization.matrix.task_9;

//  Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//  столбец содержит максимальную сумму.

public class MainTask9 {

    public static void main(String[] args) {

        Task9 t9 = new Task9(4);
        t9.createRandomMatrix();
        System.out.println("Данная матрица:\n");
        t9.printMatrix();
        t9.doTask9();

    }

}
