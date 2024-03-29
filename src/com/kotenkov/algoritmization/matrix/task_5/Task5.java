package com.kotenkov.algoritmization.matrix.task_5;

//  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//  1   1   1   ... 1
//  2   2   2   ... 0
//  3   3   3   ... 0
//  ..  ..  ..  ... ..
//  n-1 n-1 0   ... 0
//  n   0   0   ... 0

public class Task5 {

    private int [] [] matrix;
    private int n;

    public Task5(int n) {
        this.n = n;
    }

    public void printMatrix(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void doTask5(){
        matrix = new int [n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - i; j++) {
                matrix[i][j] = i + 1;
            }
        }
    }

}
