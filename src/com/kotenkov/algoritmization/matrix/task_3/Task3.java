package com.kotenkov.algoritmization.matrix.task_3;

public class Task3 {

    private int [] [] matrix;
    private int m;
    private int n;
    private int k;
    private int p;

    public Task3(int m, int n, int k, int p) {
        this.m = m;
        this.n = n;
        this.k = k;
        this.p = p;
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

    public void doTask3(){
        if(k <= matrix.length){
            System.out.println("Выводим " + k + "-ую строку:");
            for (int i = 0; i < matrix[k - 1].length; i++) {
                System.out.print(matrix[k - 1][i] + "\t");
            }
        } else {
            System.out.println("k должно быть меньше или равно " + m);
        }

        if(p <= matrix[0].length){
            System.out.println("\nВыводим " + p + "-й столбец:");
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(matrix[i][ p - 1]);
            }
        } else {
            System.out.println("\np должно быть меньше или равно " + n);
        }
    }

}
