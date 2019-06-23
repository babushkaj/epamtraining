package com.kotenkov.algoritmization.matrix.task_13;

//  Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class MainTask13 {

    public static void main(String[] args) {

        Task13 t13 = new Task13(5);
        t13.createRandomMatrix();
        System.out.println("\nИсходная матрица: \n");
        t13.printMatrix();
        t13.doTask13();
        System.out.println("\nМатрица после сортировки: \n");
        t13.printMatrix();

    }

}
