package com.kotenkov.algoritmization.one_dimensional_array.task_5;

public class Task5 {

    private int n;
    private int [] array;

    public Task5(int n) {
        this.n = n;
    }

    public void createRandomArray(){
        array = new int [n];
        for (int i = 0; i < array.length; i++) {
            array [i] = (int)(Math.random()*10 + 1);
        }
    }

    public void doTask5(){
        System.out.println("Выводим числа, для которых ai > i (если таковые имеются)...");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > (i + 1)){
                System.out.print(array[i] + "\t");
            }
        }
    }

    public void printArray(){
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array [i] + "\t");
        }
        System.out.print(" ]\n");
    }

}
