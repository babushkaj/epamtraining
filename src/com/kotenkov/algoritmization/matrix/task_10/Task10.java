package com.kotenkov.algoritmization.matrix.task_10;

//  Найти положительные элементы главной диагонали квадратной матрицы.

public class Task10 {

    private int [] [] matrix;
    private int n;

    public Task10(int n) {
        this.n = n;
    }

    public void createRandomMatrix(){
        matrix = new int [n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix [i][j] = (int)(Math.random()*10) - 5;
            }
        }
    }

    public void printMatrix(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void doTask10(){
        System.out.print("\nПоложительные элементы главной диагонали:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i == j && matrix[i][j] > 0){
                    System.out.print(matrix[i][j] + "\t");
                }
            }
        }

    }

}
