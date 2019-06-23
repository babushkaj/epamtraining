package com.kotenkov.algoritmization.decomposition.task_1;

//  Написать метод(методы) для нахождения наибольшего общего делителя и
//  наименьшего общего кратного двух натуральных чисел


public class MainTask1 {

    public static void main(String[] args) {

        int nod = Task1.findNOD(68, 34);
        System.out.println("Наибольший общий делитель:" + nod);
        int nok = Task1.findNOK(68, 34);
        System.out.println("Наименьшее общее кратное:" + nok);

    }

}
