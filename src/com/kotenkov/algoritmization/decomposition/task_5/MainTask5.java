package com.kotenkov.algoritmization.decomposition.task_5;

//  Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//  которое меньше максимального элемента массива, но больше всех других элементов).

public class MainTask5 {

    public static void main(String[] args) {

        int [] matrix = Task5.createRandomArray(7);
        Task5.printArray(matrix);
        System.out.println("Второе по величине число в массиве: " +
                            Task5.findTheSecondNumber(matrix));

    }

}
