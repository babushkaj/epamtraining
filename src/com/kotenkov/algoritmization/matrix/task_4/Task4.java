package com.kotenkov.algoritmization.matrix.task_4;

//  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
//  1   2   3   ... n
//  n   n-1 n-2 ... 1
//  1   2   3   ... n
//  n   n-1 n-2 ... 1
//  ..  ..  ..  ... ..
//  n   n-1 n-2 ... 1

public class Task4 {

    private int [] [] matrix;
    private int n;

    public Task4(int n) {
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

    public void doTask4(){
        matrix = new int [n][n];
        for (int i = 0; i < matrix.length; i++) {
            if(i % 2 == 0){
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix [i][j] = j + 1;
                }
            } else {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix [i][j] = matrix[i].length - j;
                }
            }
        }
    }

}
