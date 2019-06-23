package com.kotenkov.algoritmization.matrix.task_14;

//  Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
//  причем в каждом столбце число единиц равно номеру столбца.

public class MainTask14 {

    public static void main(String[] args) {

        Task14 t14 = new Task14(10,5);
        t14.doTask14();
        t14.printMatrix();

    }

}
