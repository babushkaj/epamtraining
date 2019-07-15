package com.kotenkov.algoritmization.matrix.task_12;

//  Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class MainTask12 {

    public static void main(String[] args) {

        Task12 t12 = new Task12(7);
        t12.createRandomMatrix();
        System.out.println("\nИсходная матрица: \n");
        t12.printMatrix();
        t12.doAscendingSorting();
        System.out.println("\nМатрица после сортировки элементов строк по возрастанию: \n");
        t12.printMatrix();
        t12.doDescendingSorting();
        System.out.println("\nМатрица после сортировки элементов строк по убыванию: \n");
        t12.printMatrix();


    }

}
