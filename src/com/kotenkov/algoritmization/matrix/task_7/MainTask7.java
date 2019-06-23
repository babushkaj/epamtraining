package com.kotenkov.algoritmization.matrix.task_7;

//  Сформировать квадратную матрицу порядка N по правилу:
//  A[I,J] = sin[(I*I - J*J)/n]
//  и подсчитать количество положительных элементов в ней.

public class MainTask7 {

    public static void main(String[] args) {

        Task7 t7 = new Task7(5);
        t7.doTask7();
        t7.printMatrix();
        t7.countPositiveElements();

    }

}
