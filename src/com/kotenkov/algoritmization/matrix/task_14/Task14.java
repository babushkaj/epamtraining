package com.kotenkov.algoritmization.matrix.task_14;

//  Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
//  причем в каждом столбце число единиц равно номеру столбца.

public class Task14 {

    private int [] [] matrix;
    private int m;
    private int n;

    public Task14(int m, int n) {
        this.m = m;
        this.n = n;
    }

    private void createRandomMatrix(){
        matrix = new int [m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix [i][j] = (int)(Math.random()*16);
            }
        }
    }

    public void printMatrix(){
        if (matrix != null) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nМатрица не создана!");
        }
    }

    public void doTask14(){
        if(m >= n){
            matrix = new int [m][n];
            int count = 1;
            for (int i = 0; i < matrix[0].length; i++) {
                int oneInTheColumn = 0;
                for (int j = 0; j < matrix.length; j++) {
                    if(oneInTheColumn < count) {
                        if((count - oneInTheColumn) < (matrix.length - j - 1)){
                            matrix[j][i] = (int) (Math.random() * 2);
                            if (matrix[j][i] == 1){
                                oneInTheColumn++;
                            }
                        } else {
                            matrix[j][i] = 1;
                            oneInTheColumn++;
                        }
                    } else {
                        matrix[j][i] = 0;
                    }
                }
                count++;
            }
        } else {
            System.out.println("Для данной задачи количество строк матрицы должно\n" +
                    "быть больше или равно количеству столбцов.\nПожалуйста, создайте " +
                    " объект Task14 в соответствии с данным требованием.");
        }

    }

}
