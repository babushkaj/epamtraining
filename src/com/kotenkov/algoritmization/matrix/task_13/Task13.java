package com.kotenkov.algoritmization.matrix.task_13;

public class Task13 {

    private int [] [] matrix;
    private int n;

    public Task13(int n) {
        this.n = n;
    }

    public void createRandomMatrix(){
        matrix = new int [n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix [i][j] = (int)(Math.random()*10);
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

    public void doTask13(){
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                for (int k = 0; k < matrix.length - 1; k++) {
                    if(matrix[k][i] > matrix[k+1][i]){
                        int tmp = matrix[k][i];
                        matrix[k][i] = matrix[k+1][i];
                        matrix[k+1][i] = tmp;
                    }
                }
            }
        }
    }

}
