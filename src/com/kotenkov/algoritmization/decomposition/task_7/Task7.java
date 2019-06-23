package com.kotenkov.algoritmization.decomposition.task_7;

public class Task7 {

    private static int calculateFactorial(int n){
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int doTask7(){
        int result = 0;
        for (int i = 1; i < 10; i+=2) {
            result += calculateFactorial(i);
        }
        return result;
    }

}
