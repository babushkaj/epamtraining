package com.kotenkov.algoritmization.matrix.task_15;

//  Найти наибольший элемент матрицы и заменить все нечётные элементы на него.

public class MainTask15 {

    public static void main(String[] args) {

        Task15 t15 = new Task15(5);
        t15.createRandomMatrix();
        System.out.println("\nМатрица до замены\n");
        t15.printMatrix();
        t15.doTask15();
        System.out.println("\nМатрица после замены\n");
        t15.printMatrix();

    }

}
