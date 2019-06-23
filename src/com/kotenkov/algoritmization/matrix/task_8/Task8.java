package com.kotenkov.algoritmization.matrix.task_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {

    private int [] [] matrix;
    private int n;
    private int theFirstColumn;
    private int theSecondColumn;

    public Task8(int n) {
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

    public void doTask8(){
        if(theFirstColumn == theSecondColumn){
            System.out.println("\nНомера введённых столбцов совпадают => " +
                    "ничего переставлять не нужно, матрица и без того идеальна))");
        } else {
            for (int i = 0; i < matrix.length; i++) {
                int tmp = matrix[i][theFirstColumn - 1];
                matrix[i][theFirstColumn - 1] = matrix[i][theSecondColumn - 1];
                matrix[i][theSecondColumn - 1] = tmp;
            }
        }
    }

    public void enterColumnsNumbers() throws IOException {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.println("\nВведите номер первого столбца для перестановки (целое число от 1 до " + n + "):");
                String line = reader.readLine();
                try {
                    theFirstColumn = Integer.parseInt(line);
                    if (theFirstColumn > 0 && theFirstColumn <= n) {
                        System.out.println("\nПервый столбец для перестановки имеет номер " + theFirstColumn);
                        break;
                    } else {
                        System.out.println("\nПроверьте вводимое число и повторите ввод!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("\nВы ввели не целое число! Повторите ввод!");
                    continue;
                }
            }
            while (true) {
                System.out.println("\nВведите номер второго столбца для перестановки (целое число от 1 до " + n + "):");
                String line = reader.readLine();
                try {
                    theSecondColumn = Integer.parseInt(line);
                    if (theSecondColumn > 0 && theSecondColumn <= n) {
                        System.out.println("\nВторой столбец для перестановки имеет номер " + theSecondColumn);
                        break;
                    } else {
                        System.out.println("\nПроверьте вводимое число и повторите ввод!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("\nВы ввели не целое число! Повторите ввод!");
                    continue;
                }
            }
        } finally {
            if (reader != null){
                reader.close();
            }
        }
    }

}
