package com.kotenkov.algoritmization.matrix.task_8;

//  В числовой матрице поменять местами два столбца, т. е. все элементы одного столбца поставить на
//  соответствующие им позиции другого, а элементы второго переместить в первый. Номера столбцов вводит
//  пользователь с клавиатуры.

import java.util.Scanner;

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

    public void enterColumnsNumbers() {
        Scanner scanner = new Scanner(System.in);

        while (theFirstColumn <= 0 || theFirstColumn > n) {
            System.out.println("\nВведите номер первого столбца для перестановки (целое число от 1 до " + n + "):");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("\nВведите номер первого столбца для перестановки (целое число от 1 до " + n + "):");
            }

            theFirstColumn = scanner.nextInt();

            if (theFirstColumn > 0 && theFirstColumn < n) {
                break;
            }
        }

        while (theSecondColumn <= 0 || theSecondColumn > n) {
            System.out.println("\nВведите номер второго столбца для перестановки (целое число от 1 до " + n + "):");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("\nВведите номер второго столбца для перестановки (целое число от 1 до " + n + "):");
            }

            theSecondColumn = scanner.nextInt();

            if (theSecondColumn > 0 && theSecondColumn < n) {
                break;
            }
        }
    }

}
