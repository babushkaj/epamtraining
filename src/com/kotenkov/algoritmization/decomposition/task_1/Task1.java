package com.kotenkov.algoritmization.decomposition.task_1;

//  Написать метод(методы) для нахождения наибольшего общего делителя и
//  наименьшего общего кратного двух натуральных чисел

public class Task1 {

    private static int findNOD(int m, int n){
        int nod = 1;
        for (int i = m; i > 1; i--) {
            if((m%i == 0) && (n%i == 0)){
                nod = i;
                break;
            }
        }
        return nod;
    }

    private static int findNOK(int m, int n){
        int nok = (m * n)/findNOD(m, n);
        return nok;
    }

    public static void main(String[] args) {

        int nod = Task1.findNOD(68, 34);
        System.out.println("Наибольший общий делитель:" + nod);
        int nok = Task1.findNOK(6, 7);
        System.out.println("Наименьшее общее кратное:" + nok);

    }

}
