package com.kotenkov.algoritmization.decomposition.task_6;

//  Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Task6 {

    private static boolean findCD(int l, int m, int n){
        boolean cdIsOnly = true;

        for (int i = l; i > 1; i--) {
            if((l%i == 0) && (m%i == 0) && (n%i ==0)){
                cdIsOnly = false;
                break;
            }
        }

        return cdIsOnly;
    }

    private static void doTask6(int l, int m, int n){
        if(!findCD(l, m, n)){
            System.out.println("\nЧисла " + l + ", " + m + " и " + n + " не являются взаимно простыми.");
        } else {
            System.out.println("\nЧисла " + l + ", " + m + " и " + n + " являются взаимно простыми.");
        }
    }

    public static void main(String[] args) {

        Task6.doTask6(2,5,13);
        Task6.doTask6(10, 15, 5);
        Task6.doTask6(17, 13, 3);
        Task6.doTask6(13,9, 6);

    }

}
