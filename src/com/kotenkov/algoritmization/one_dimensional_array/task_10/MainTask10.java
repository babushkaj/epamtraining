package com.kotenkov.algoritmization.one_dimensional_array.task_10;

//  Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//  элемент (освободившиеся элементы заполнить нулями). Примечание: дополнительный массив не использовать.

public class MainTask10 {

    public static void main(String[] args) {

        Task10 t10 = new Task10(9);
        t10.createRandomArray();
        System.out.println("Исходный массив: ");
        t10.printArray();
        t10.doTask10();
        System.out.println("\nМассив после замены: ");
        t10.printArray();

    }

}
