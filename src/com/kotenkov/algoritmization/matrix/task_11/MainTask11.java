package com.kotenkov.algoritmization.matrix.task_11;

//  Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//  которых число 5 встречается три и более раз.

public class MainTask11 {

    public static void main(String[] args) {

        Task11 t11 = new Task11(10,20);
        t11.createRandomMatrix();
        t11.printMatrix();
        t11.doTask11();

    }

}
