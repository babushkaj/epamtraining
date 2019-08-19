package com.kotenkov.algoritmization.one_dimensional_array.task_10;

//  Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//  элемент (освободившиеся элементы заполнить нулями). Примечание: дополнительный массив не использовать.

public class Task10 {

    private int n;
    private int [] array;

    public Task10(int n) {
        if(n <= 0){
            this.n = 5;
        } else {
            this.n = n;
        }
    }

    private void createRandomArray(){
        array = new int [n];
        for (int i = 0; i < array.length; i++) {
            array [i] = (int)(Math.random()*10 + 1);
        }
    }

    private void printArray(){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array [i] + "\t");
        }
        System.out.println();
    }

    private void doTask10(){
        for (int i = 0; i < array.length; i++) {
            if(i % 2 != 0){
                array[i] = 0;
            }
        }

        if(array.length > 2){
            for (int i = 2; i < array.length; i += 2) {
                int tmp = array[i];
                array[i] = array[i - i/2];
                array[i - i/2] = tmp;
            }
        }
    }

    public static void main(String[] args) {

        Task10 t10 = new Task10(10);
        t10.createRandomArray();
        System.out.println("Исходный массив: ");
        t10.printArray();
        t10.doTask10();
        System.out.println("\nМассив после замены: ");
        t10.printArray();

    }
}
