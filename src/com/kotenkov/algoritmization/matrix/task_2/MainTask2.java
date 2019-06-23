package com.kotenkov.algoritmization.matrix.task_2;

//  Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class MainTask2 {

    public static void main(String[] args) {

        Task2 t2 = new Task2(7);
        t2.createRandomMatrix();
        System.out.println("Исходная атрица: ");
        t2.printMatrix();
        t2.doTask2();

    }

}
