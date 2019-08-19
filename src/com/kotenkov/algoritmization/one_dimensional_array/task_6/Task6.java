package com.kotenkov.algoritmization.one_dimensional_array.task_6;

//  Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//  являются простыми числами (нумерацию чисел начинаю с 1)

public class Task6 {

    private int n;
    private double [] array;
    private boolean isSimple;
    private double sum;

    public Task6(int n) {
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
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array [i] + "\t");
        }
        System.out.print(" ]\n");
    }

    private void showResult(){
        System.out.println("\nСумма чисел, порядковые номера которых являются простыми числами" +
                           " (нумерацию чисел в массиве начинаю с \'1\'): " + sum);
    }

    private void doTask6(){
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

    public static void main(String[] args) {

        Task6 t6 = new Task6(7);
        t6.createRandomArray();
        System.out.println("Массив: ");
        t6.printArray();
        t6.doTask6();
        t6.showResult();

    }

}
