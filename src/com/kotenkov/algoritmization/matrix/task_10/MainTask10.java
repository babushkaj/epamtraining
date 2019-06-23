package com.kotenkov.algoritmization.matrix.task_10;

//  Найти положительные элементы главной диагонали квадратной матрицы.

public class MainTask10 {

    public static void main(String[] args) {

        Task10 t10 = new Task10(8);
        t10.createRandomMatrix();
        System.out.println("\nДанная матрица: \n");
        t10.printMatrix();
        t10.doTask10();

    }

}
