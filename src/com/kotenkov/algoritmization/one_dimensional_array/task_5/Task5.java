package com.kotenkov.algoritmization.one_dimensional_array.task_5;

//      Даны целые числа а1 ,а2 ,..., аn. Вывести на печать только те числа, для которых аi > i.

public class Task5 {

    private int n;
    private int [] array;

    public Task5(int n) {
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

    private void doTask5(){
        System.out.println("Выводим числа, для которых ai > i (если таковые имеются)...");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > (i + 1)){
                System.out.print(array[i] + "\t");
            }
        }
    }

    public static void main(String[] args) {

        Task5 t5 = new Task5(5);
        t5.createRandomArray();
        System.out.println("Массив: ");
        t5.printArray();
        t5.doTask5();

    }

}
