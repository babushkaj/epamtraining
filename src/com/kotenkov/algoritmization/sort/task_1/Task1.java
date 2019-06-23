package com.kotenkov.algoritmization.sort.task_1;

public class Task1 {

    private static boolean checkPosition(int [] array, int k){

        if((k > 0) && (k < array.length)){
            return true;
        } else {
            System.out.println("Номер позиции для вставки второго массива должен быть в диапазоне от 1 до "
                               + (array.length - 1) + ". Объединение массивов не будет произведено.");
            return false;
        }

    }

    private static int [] mergeArrays(int [] arrayOne, int [] arrayTwo, int k) {

        int [] newArray = new int [arrayOne.length + arrayTwo.length];
        int i = 0;
        int j = 0;

        while (i < newArray.length) {

            if(i == k){
                for (int l = 0; l < arrayTwo.length; l++) {
                    newArray[i + l] = arrayTwo[l];
                }
                i += arrayTwo.length;
            }

                newArray[i] = arrayOne[j];
                j++;
                i++;

        }

        return newArray;
    }

    public static void doTask1(int [] arrayOne, int [] arrayTwo, int k){

        if (checkPosition(arrayOne, k)){
            int [] newArray = mergeArrays(arrayOne, arrayTwo, k);
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + "\t");
            }
            System.out.println("\n");
        }

    }

}
