package com.kotenkov.algoritmization.matrix.task_9;

public class Task9 {

    private int [] [] matrix;
    private int n;

    public Task9(int n) {
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

    public void doTask9(){
        int [] sumArray = new int[n];
        int maxSum = 0;
        int maxIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sumArray[j] += matrix[i][j];
            }
        }

        maxSum = sumArray[maxIndex];

        for (int i = 1; i < sumArray.length; i++) {
            if(sumArray[i] > maxSum){
                maxSum = sumArray[i];
                maxIndex = i;
            }
        }

        System.out.println("\nСтолбец № " + (maxIndex + 1) + " содержит максимальную сумму элементов.");
    }

}
