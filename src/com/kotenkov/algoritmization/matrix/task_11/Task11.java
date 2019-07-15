package com.kotenkov.algoritmization.matrix.task_11;

//  Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//  которых число 5 встречается три и более раз.

public class Task11 {

    private int [] [] matrix;
    private int m;
    private int n;

    public Task11(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public void createRandomMatrix(){
        matrix = new int [m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix [i][j] = (int)(Math.random()*16);
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

    public void doTask11(){
        int [] matchMatrix = new int [m];
        for (int i = 0; i < matrix.length; i++) {
            int matchCount = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5){
                    matchCount++;
                }
            }
            if (matchCount >= 3){
                matchMatrix[i] = 1;
            }
        }

        System.out.println("\nНомера строк (отсчёт ведётся с 1), в которых число 5 встречается три и более раз: ");
        for (int i = 0; i < matchMatrix.length; i++) {
            if(matchMatrix[i] == 1){
                System.out.print((i + 1) + "\t");
            }
        }
    }

}
