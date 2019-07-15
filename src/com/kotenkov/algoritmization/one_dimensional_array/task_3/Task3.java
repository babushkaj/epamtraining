package com.kotenkov.algoritmization.one_dimensional_array.task_3;

//      Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//      положительных и нулевых элементов.

public class Task3 {

    private int n;
    private int positive;
    private int negative;
    private int zero;
    private double [] array;

    public Task3(int n) {
        if(n <= 0){
            this.n = 5;
        } else {
            this.n = n;
        }
    }

    private void createRandomArray(){
        array = new double [n];
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 5 == 0){
                array [i] = 0;
            } else{
                array [i] = Math.random()*9 - 4;
            }
        }
    }

    private void printArray(){
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array [i] + "\t");
        }
        System.out.print(" ]\n");
    }

    private void showResult(){
        System.out.println("Количество положительных чисел в массиве: " + positive);
        System.out.println("Количество отрицательных чисел в массиве: " + negative);
        System.out.println("Количество нулей в массиве: " + zero);
    }

    private void doTask3(){
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0){
                positive++;
            } else if (array[i] < 0){
                negative++;
            } else{
                zero++;
            }
        }
    }

    public static void main(String[] args) {

        Task3 t3 = new Task3(7);
        t3.createRandomArray();
        System.out.println("Массив: ");
        t3.printArray();
        t3.doTask3();
        t3.showResult();

    }

}
