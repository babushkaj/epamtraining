package com.kotenkov.algoritmization.sort.task_5;

//  Сортировка вставками. Дана последовательность чисел a1, a2, ... , an. Требуется переставить числа в порядке
//  возрастания. Делается это следующим образом. Пусть a1, a2, ... , an - упорядоченная последовательность, т. е.
//  a1 <= a2 <= ... <= an. Берется следующее число  ai+1 и вставляется в последовательность так, чтобы новая
//  последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
//  не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
//  с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

public class Task5 {

    private static int binarySearch(int [] array, int end, int number){
        int start = 0;
        int finish = end;
        int position = -1;

        while(start <= finish){
            int k = (start + finish)/2;
            if((number >= array[k]) && (number < array[k+1])) {
                position = k + 1;
                break;
            } else if (k == 0 && number < array[k]){
                position = 0;
                break;
            } else if (number < array[k]){
                finish = k - 1;
            } else if (number >= array[k+1]){
                start = k + 1;
            }
        }

        return position;
    }

    private static void swap(int [] array, int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private static void shift(int [] array, int i, int j){
        for (int k = j; k > i; k--) {
            swap(array, k, k-1);
        }
    }

    private static void doSort(int [] array){
        for (int i = 0; i < array.length - 1; i++) {
            int position = binarySearch(array, i, array[i+1]);
            if (position != -1) {
                shift(array, position, i + 1);
            }
        }
    }

    private static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\n");
    }

    public static void doTask5(int [] array){
        System.out.println("Массив до сортировки:");
        printArray(array);
        doSort(array);
        System.out.println("Массив после сортировки:");
        printArray(array);
    }

}
