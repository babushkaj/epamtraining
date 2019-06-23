package com.kotenkov.algoritmization.matrix.task_1;

import javax.sound.midi.Soundbank;

public class Task1 {

    private int [] [] matrix;
    private int m;
    private int n;

    public Task1(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public void createRandomMatrix(){
        matrix = new int [m][n];
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

    public void doTask1(){
        System.out.println("Нечётные столбцы, у которых первый элемент больше последнего: ");
        for (int i = 0; i < matrix[0].length; i = i + 2) {
            if(matrix[0][i] > matrix[matrix.length - 1][i]){
                System.out.println("Столбец № " + (i+1));
                for (int j = 0; j < matrix.length; j++) {
                    System.out.println(matrix[j][i]);
                }
            }
        }
    }

}
