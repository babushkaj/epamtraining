package com.kotenkov.algoritmization.matrix.task_6;

//  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//  1   1   1   ... 1
//  0   1   1   ... 0
//  0   0   1   ... 0
//  ..  ..  ..  ... ..
//  0   1   1   ... 0
//  1   1   1   ... 1

public class Task6 {

    private int [] [] matrix;
    private int n;

    public Task6(int n) {
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

    public void doTask6(){
        matrix = new int [n][n];
        for (int i = 0; i < matrix.length/2; i++) {
            for (int j = i; j < matrix[i].length - i; j++) {
                matrix[i][j] = 1;
            }
        }
        for (int i = matrix.length/2; i < matrix.length; i++) {
            for (int j = matrix.length - i - 1; j < i + 1; j++) {
                matrix[i][j] = 1;
            }
        }
    }
}
