package com.kotenkov.algoritmization.one_dimensional_array.task_9;

public class Task9 {

    private int n;
    private int [] array;
    private int [] markersArray;
    private int result;

    public Task9(int n) {
        this.n = n;
    }

    public void createRandomArray(){
        array = new int [n];
        for (int i = 0; i < array.length; i++) {
            array [i] = (int)(Math.random()*10 + 1);
        }
    }

    public void doTask9(){
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

    public void printArray(){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array [i] + "\t");
        }
        System.out.println();
    }

    public void printMarkersArray(){
        System.out.println("Количество повторений для каждого числа(\"0\" - число было ранее): ");
        for (int i = 0; i < markersArray.length; i++) {
            System.out.print(markersArray [i] + "\t");
        }
        System.out.println();
    }

    public void showResult(){
        System.out.println("Наименьшее из наиболее часто встречающихся чисел: " + result);
    }

}
