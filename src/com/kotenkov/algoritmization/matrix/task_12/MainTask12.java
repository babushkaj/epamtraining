package com.kotenkov.algoritmization.matrix.task_12;

//  Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class MainTask12 {

    public static void main(String[] args) {

        Task12 t12 = new Task12(10);
        t12.createRandomMatrix();
        System.out.println("\nИсходная матрица: \n");
        t12.printMatrix();
        t12.doTask12();
        System.out.println("\nМатрица после сортировки: \n");
        t12.printMatrix();

    }

}
