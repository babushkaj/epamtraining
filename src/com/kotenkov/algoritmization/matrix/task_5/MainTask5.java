package com.kotenkov.algoritmization.matrix.task_5;

//  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//  1   1   1   ... 1
//  2   2   2   ... 0
//  3   3   3   ... 0
//  ..  ..  ..  ... ..
//  n-1 n-1 0   ... 0
//  n   0   0   ... 0

public class MainTask5 {

    public static void main(String[] args) {

        Task5 t5 = new Task5(10);
        t5.doTask5();
        t5.printMatrix();

    }

}
