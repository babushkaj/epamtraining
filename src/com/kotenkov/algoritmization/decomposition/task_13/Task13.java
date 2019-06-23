package com.kotenkov.algoritmization.decomposition.task_13;

public class Task13 {

    private static boolean isSimpleNumber(int n){
        boolean isSimple = true;
        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                isSimple = false;
                break;
            }
        }
        return isSimple;
    }

    public static void doTask13(int n){
        for (int i = 3; i < n - 1; i++) {
            if(isSimpleNumber(i) && isSimpleNumber(i + 2)){
                System.out.println("\nЧисла " + i + " и " + (i+2) + " являются \"близнецами\".");
            }
        }
    }

}
