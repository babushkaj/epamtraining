package com.kotenkov.algoritmization.matrix.task_6;

//  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//  1   1   1   ... 1
//  0   1   1   ... 0
//  0   0   1   ... 0
//  ..  ..  ..  ... ..
//  0   1   1   ... 0
//  1   1   1   ... 1

public class MainTask6 {

    public static void main(String[] args) {

        Task6 t6 = new Task6(10);
        t6.doTask6();
        t6.printMatrix();

    }

}
