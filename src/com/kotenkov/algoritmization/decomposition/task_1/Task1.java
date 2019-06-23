package com.kotenkov.algoritmization.decomposition.task_1;

public class Task1 {

    public static int findNOD(int m, int n){
        int nod = 1;
        for (int i = m; i > 1; i--) {
            if((m%i == 0) && (n%i ==0)){
                nod = i;
                break;
            }
        }
        return nod;
    }

    public static int findNOK(int m, int n){
        int nok = (m * n)/findNOD(m, n);
        return nok;
    }

}
