package com.kotenkov.algoritmization.matrix.task_4;

//  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
//  1   2   3   ... n
//  n   n-1 n-2 ... 1
//  1   2   3   ... n
//  n   n-1 n-2 ... 1
//  ..  ..  ..  ... ..
//  n   n-1 n-2 ... 1

public class MainTask4 {

    public static void main(String[] args) {

        Task4 t4 = new Task4(8);
        t4.doTask4();
        t4.printMatrix();

    }

}
