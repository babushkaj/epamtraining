package com.kotenkov.algoritmization.one_dimensional_array.task_6;

//  Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//  являются простыми числами (нумерацию чисел начинаю с 1)

public class MainTask6 {

    public static void main(String[] args) {

        Task6 t6 = new Task6(5);
        t6.createRandomArray();
        System.out.println("Массив: ");
        t6.printArray();
        t6.doTask6();
        t6.showResult();

    }

}
