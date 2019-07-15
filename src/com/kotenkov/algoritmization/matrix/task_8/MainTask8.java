package com.kotenkov.algoritmization.matrix.task_8;

//  В числовой матрице поменять местами два столбца, т. е. все элементы одного столбца поставить на
//  соответствующие им позиции другого, а элементы второго переместить в первый. Номера столбцов вводит
//  пользователь с клавиатуры.


public class MainTask8 {

    public static void main(String[] args) {

        Task8 t8 = new Task8(5);
        t8.createRandomMatrix();
        t8.enterColumnsNumbers();
        System.out.println("\nИсходная матрица: \n");
        t8.printMatrix();
        t8.doTask8();
        System.out.println("\nМатрица после замены столбцов: \n");
        t8.printMatrix();

    }

}
