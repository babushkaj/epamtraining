package com.kotenkov.algoritmization.one_dimensional_array.task_7;

//  Даны действительные числа   a1, a2, ... ,a2n. Найти max(a1 + a2n, a2 + a2n-1 , ... , an + an+1)

public class Task7 {

    private int n;
    private double [] array;
    private double max;

    public Task7(int n) {
        if(n <= 0){
            this.n = 5;
        } else {
            this.n = n;
        }
    }

    private void createRandomArray(){
        array = new double [n];
        for (int i = 0; i < array.length; i++) {
            array [i] = Math.random()*10;
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
        System.out.println("max(a1 + a2n, a2 + a2n-1 , ... , an + an+1): " + max);
    }

    private void doTask7(){
        if(array.length == 1){

            max = array[0];

        }else{

            max = array[0] + array[array.length - 1];
            for (int i = 1; i < array.length/2; i++) {
                if(array[i] + array[array.length - i - 1] > max){
                    max = array[i] + array[array.length - i - 1];
                }
            }

        }
    }

    public static void main(String[] args) {

        Task7 t7 = new Task7(1);
        t7.createRandomArray();
        System.out.println("Массив: ");
        t7.printArray();
        t7.doTask7();
        t7.showResult();

    }

}
