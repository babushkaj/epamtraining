package com.kotenkov.algoritmization.one_dimensional_array.task_6;

public class Task6 {

    private int n;
    private double [] array;
    private boolean isSimple;
    private double sum;

    public Task6(int n) {
        this.n = n;
    }

    public void createRandomArray(){
        array = new double [n];
        for (int i = 0; i < array.length; i++) {
            array [i] = Math.random()*10;
        }
    }

    public void doTask6(){
        for (int i = 1; i < array.length; i++) {
            for (int j = 2; j < i+1; j++) {
                if((i + 1) % j == 0){
                    isSimple = true;
                }
            }
            if(!isSimple){
                sum += array[i];
            }
            isSimple = false;
        }
    }

    public void printArray(){
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array [i] + "\t");
        }
        System.out.print(" ]\n");
    }

    public void showResult(){
        System.out.println("Сумма чисел, порядковые номера которых являются простыми числами: " + sum);
    }

}
