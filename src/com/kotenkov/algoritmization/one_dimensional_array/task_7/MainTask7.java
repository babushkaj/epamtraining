package com.kotenkov.algoritmization.one_dimensional_array.task_7;

//  Даны действительные числа   a1, a2, ... ,a2n. Найти max(a1 + a2n, a2 + a2n-1 , ... , an + an+1)

public class MainTask7 {

    public static void main(String[] args) {

        Task7 t7 = new Task7(6);
        t7.createRandomArray();
        System.out.println("Массив: ");
        t7.printArray();
        t7.doTask7();
        t7.showResult();

    }

}
