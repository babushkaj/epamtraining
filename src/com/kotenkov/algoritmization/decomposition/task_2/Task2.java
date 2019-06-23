package com.kotenkov.algoritmization.decomposition.task_2;

public class Task2 {

    public static int findNOD(int k, int l, int m, int n){
        int nod = 1;
        for (int i = m; i > 1; i--) {
            if((k%i == 0) && (l%i ==0) && (m%i == 0) && (n%i ==0)){
                nod = i;
                break;
            }
        }
        return nod;
    }

}
