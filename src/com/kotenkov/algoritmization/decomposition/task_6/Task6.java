package com.kotenkov.algoritmization.decomposition.task_6;

public class Task6 {

    public static void doTask6(int l, int m, int n){
        if(!findCD(l, m, n)){
            System.out.println("\nЧисла " + l + ", " + m + " и " + n + " не являются взаимно простыми.");
        } else {
            System.out.println("\nЧисла " + l + ", " + m + " и " + n + " являются взаимно простыми.");
        }
    }

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

}
