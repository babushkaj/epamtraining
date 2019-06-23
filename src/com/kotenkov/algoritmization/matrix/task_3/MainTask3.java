package com.kotenkov.algoritmization.matrix.task_3;

//  Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class MainTask3 {

    public static void main(String[] args) {

        Task3 t3 = new Task3(3,4, 2, 4);
        t3.createRandomMatrix();
        System.out.println("Исходная матрица: ");
        t3.printMatrix();
        t3.doTask3();

    }

}
