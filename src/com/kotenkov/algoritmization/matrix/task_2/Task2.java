package com.kotenkov.algoritmization.matrix.task_2;

//  Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task2 {

    private int [] [] matrix;
    private int m;

    public Task2(int m) {
        this.m = m;
    }

    public void createRandomMatrix(){
        matrix = new int [m][m];
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

    public void doTask2(){
        System.out.println("Элементы, стоящие на диагонали матрицы: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if( i == j){
                    System.out.print(matrix[i][j] + "\t");
                }
            }
        }
    }

}
