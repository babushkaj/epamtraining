package com.kotenkov.algoritmization.decomposition.task_2;

//  Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Task2 {

    private static int findNOD(int k, int l, int m, int n){
        int nod = 1;
        for (int i = m; i > 1; i--) {
            if((k%i == 0) && (l%i ==0) && (m%i == 0) && (n%i ==0)){
                nod = i;
                break;
            }
        }
        return nod;
    }

    public static void main(String[] args) {

        int nod = Task2.findNOD(15, 30, 60, 45);
        System.out.println("Наибольший общий делитель: " + nod);

    }

}
