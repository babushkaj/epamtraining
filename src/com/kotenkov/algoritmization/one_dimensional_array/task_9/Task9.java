package com.kotenkov.algoritmization.one_dimensional_array.task_9;

//     В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
//     Если таких чисел несколько, то определить наименьшее из них.

public class Task9 {

    private int n;
    private int [] array;
    private int [] markersArray;
    private int result;

    public Task9(int n) {
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

    private void doTask9(){
        int [] copyOfArray = new int [n];
        markersArray = new int [n];
        copyOfArray[0] = array[0];
        markersArray[0] = 1;
        boolean numberIsRepeated = false;

        //считаем количество повторений для кажого числа в последовательности и заносим в markersArray
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i ; j++) {
                if (array[i] == copyOfArray[j]){
                    markersArray[j]++;
                    numberIsRepeated = true;
                    break;
                }
            }
            copyOfArray[i] = array[i];
            if (numberIsRepeated){
                markersArray[i] = 0;
            } else {
                markersArray[i] = 1;
            }
            numberIsRepeated = false;
        }

        //ищем максимальное количество повторений числа

        int maxAmount = 0;

        for (int i = 0; i < markersArray.length; i++) {
            if (markersArray[i] > maxAmount){
                maxAmount = markersArray[i];
            }
        }

        //ищем минимальное число из самых часто встречающихся

        //в качестве результата устанавливаем первое число из самых часто встречающихся
        for (int i = 0; i < array.length; i++) {
            if(markersArray[i] == maxAmount){
                result = array[i];
                break;
            }
        }

        //ищем минимальное число из самых часто встречающихся
        for (int i = 0; i < array.length; i++) {
            if(markersArray[i] == maxAmount){
                if(array[i] < result){
                    result = array[i];
                }
            }
        }
    }

    private void printArray(){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array [i] + "\t");
        }
        System.out.println();
    }

    private void printMarkersArray(){
        System.out.println("\nДополнительный массив для учёта \n" +
                           "количества повторений для каждого числа(\"0\" - число было ранее): ");
        for (int i = 0; i < markersArray.length; i++) {
            System.out.print(markersArray [i] + "\t");
        }
        System.out.println();
    }

    private void showResult(){
        System.out.println("Наименьшее из наиболее часто встречающихся чисел: " + result);
    }


    public static void main(String[] args) {

        Task9 t9 = new Task9(10);
        t9.createRandomArray();
        System.out.println("Исходная последовательность: ");
        t9.printArray();
        t9.doTask9();
        t9.printMarkersArray();
        t9.showResult();

    }
}
