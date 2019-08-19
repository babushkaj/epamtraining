package com.kotenkov.algoritmization.sort.task_1;

//  Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//  один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//  дополнительный массив.

public class MainTask1 {

    public static void main(String[] args) {

        int [] arrayOne = {1, 2, 3, 4, 5};
        int [] arrayTwo = {11, 22, 33};

        //нумерация элементов в отображаемых массивах ведется с '1'
        Task1.doTask1(arrayOne, arrayTwo, 3);
        Task1.doTask1(arrayOne, arrayTwo, 1);
        Task1.doTask1(arrayOne, arrayTwo, 4);
        Task1.doTask1(arrayOne, arrayTwo, 5);


    }

}
