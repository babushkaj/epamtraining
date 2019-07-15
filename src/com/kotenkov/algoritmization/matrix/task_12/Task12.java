package com.kotenkov.algoritmization.matrix.task_12;

//  Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task12 {

    private int [] [] matrix;
    private int n;

    public Task12(int n) {
        if(n <= 0){
            this.n = 5;
        } else {
            this.n = n;
        }
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

    public void doAscendingSorting(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                for (int k = 0; k < matrix[i].length - 1; k++) {
                    if(matrix[i][k] > matrix[i][k+1]){
                        int tmp = matrix[i][k];
                        matrix[i][k] = matrix[i][k+1];
                        matrix[i][k+1] = tmp;
                    }
                }
            }
        }
    }


    public void doDescendingSorting(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                for (int k = 0; k < matrix[i].length - 1; k++) {
                    if(matrix[i][k] < matrix[i][k+1]){
                        int tmp = matrix[i][k];
                        matrix[i][k] = matrix[i][k+1];
                        matrix[i][k+1] = tmp;
                    }
                }
            }
        }
    }

}
