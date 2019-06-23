package com.kotenkov.algoritmization.sort.task_7;

//  Пусть даны две неубывающие последовательности действительных чисел
//  a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Требуется указать те места,
//  на которые нужно вставлять элементы последовательности b1 <= b2 <= ... <= bm
//  в первую последовательность так, чтобы новая последовательность оставалась возрастающей.

public class MainTask7 {

    public static void main(String[] args) {

        int [] arrayOne = {2,2,6,7,9};
        int [] arrayTwo = {1,3,4,5,8,10,11};
        Task7.doTask7(arrayOne, arrayTwo);

    }

}
