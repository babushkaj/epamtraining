package com.kotenkov.algoritmization.matrix.task_7;

//  Сформировать квадратную матрицу порядка N по правилу:
//  A[I,J] = sin[(I*I - J*J)/n]
//  и подсчитать количество положительных элементов в ней.

public class Task7 {

    private double [] [] matrix;
    private int n;

    public Task7(int n) {
        this.n = n;
    }

    public void printMatrix(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%.3f\t", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public void doTask7(){
        matrix = new double [n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.sin((Math.pow(i+1, 2) - Math.pow(j+1,2)) / matrix.length);
            }
        }

    }

    public void countPositiveElements(){
        int positiveNumbers = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0){
                    positiveNumbers++;
                }
            }
        }
        System.out.println("\nКоличество положительных элементов в матрице: " + positiveNumbers);
    }

}
