package com.kotenkov.algoritmization.one_dimensional_array.task_8;

//       Дана последовательность целых чисел a1, a2, ... , an. Образовать новую последовательность,
//       выбросив из исходной те члены, которые равны min(a1, a2, ... , an).

public class Task8 {

    private int n;
    private int [] array;

    public Task8(int n) {
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

    private void doTask8(){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }

        System.out.println("\nНовая последовательность: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] != min){
                System.out.print(array [i] + "\t");
            }
        }
    }

    public static void main(String[] args) {

        Task8 t8 = new Task8(10);
        t8.createRandomArray();
        System.out.println("Исходная последовательность: ");
        t8.printArray();
        t8.doTask8();

    }
}
