package com.kotenkov.algoritmization.matrix.task_13;

//  Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class MainTask13 {

    public static void main(String[] args) {

        Task13 t13 = new Task13(6);
        t13.createRandomMatrix();
        System.out.println("\nИсходная матрица: \n");
        t13.printMatrix();
        t13.doAscendingSorting();
        System.out.println("\nМатрица после сортировки элементов столбцов по возрастанию: \n");
        t13.printMatrix();
        t13.doDescendingSorting();
        System.out.println("\nМатрица после сортировки элементов столбцов по убыванию: \n");
        t13.printMatrix();

    }
}
