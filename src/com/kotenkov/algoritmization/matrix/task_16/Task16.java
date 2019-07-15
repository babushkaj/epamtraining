package com.kotenkov.algoritmization.matrix.task_16;

//  Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел
//  1, 2, 3,...,n*n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей
//  равны между собой. Построить такой квадрат.

public class Task16 {

    private static boolean checkRowsAndColumnsSum(int [][] matrix, int theSumOfFirstRow){
        boolean theSumIsTheSame = true;


        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            int columnSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
                columnSum += matrix[j][i];
            }
            if(!(theSumOfFirstRow == rowSum) || !(theSumOfFirstRow == columnSum)){
                theSumIsTheSame = false;
                break;
            }
        }

        return theSumIsTheSame;
    }

    private static boolean checkDiagonals(int [][] matrix, int theSumOfFirstRow){
        int mainDiagonalSum = 0;
        int sideDiagonalSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            mainDiagonalSum += matrix[i][i];
            sideDiagonalSum += matrix[matrix.length - i - 1][matrix.length - i - 1];
        }

        if(theSumOfFirstRow == mainDiagonalSum && theSumOfFirstRow == sideDiagonalSum){
            return true;
        } else {
            return false;
        }
    }

    private static boolean checkTheMatrix(int [][] matrix){
        int theSumOfFirstRow = 0;

        for (int i = 0; i < matrix[0].length; i++) {
            theSumOfFirstRow += matrix[0][i];
        }
        System.out.println("Сумма первой строки: " + theSumOfFirstRow);
        return checkRowsAndColumnsSum(matrix, theSumOfFirstRow) &&
               checkDiagonals(matrix, theSumOfFirstRow);
    }

    private static int [][] fillMatrixFromNumber(int n, int number){
        int [] [] matrix = new int [n][n];
        int range = n * n;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(number <= range){
                    matrix[i][j] = number++;
                } else {
                    number = 1;
                    matrix[i][j] = number++;
                }
            }
        }

        return matrix;
    }

    private static void printMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void swapTwoElements(int [][] matrix, int [] thePrevious, int [] theNext){
        int tmp = matrix[theNext[0]][theNext[1]];
        matrix[theNext[0]][theNext[1]] = matrix[thePrevious[0]][thePrevious[1]];
        matrix[thePrevious[0]][thePrevious[1]] = tmp;
    }

    private static void findMagicSquares(int n){
        for (int i = 0; i <= n*n; i++) {
            int [][] matrix = fillMatrixFromNumber(n,i+1);
            int [] previous = {matrix.length - 1, matrix.length - 1};
            int [] next = {0,0};

            for (int k = matrix.length - 1; k >= 0; k--) {
                for (int l = matrix[k].length - 1; l >= 0 ; l--) {
                    if(!(k == matrix.length - 1 && l == matrix.length - 1)){
                        next[0] = k;
                        next[1] = l;
                        swapTwoElements(matrix, previous, next);
                        previous = next;
                    }
                    if(checkTheMatrix(matrix)){
                        printMatrix(matrix);

                    }

                }
            }
        }
    }

    private static void doTask16(int n){
        System.out.println("Магические квадраты " + n + " порядка:\n");
        findMagicSquares(n);
    }

    public static void main(String[] args) {

//        doTask16(3);

        int [][] matrix = {{6,1,8},
                           {7,5,3},
                           {2,9,4}};
//        int [][] matrix = {{3,4,5},
//                           {6,7,8},
//                           {9,1,2}};
        System.out.println(checkTheMatrix(matrix));
//        int [][] matrix = fillMatrixFromNumber(3, 8);
//        printMatrix(matrix);

    }

}
