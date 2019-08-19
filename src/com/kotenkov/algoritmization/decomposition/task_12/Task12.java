package com.kotenkov.algoritmization.decomposition.task_12;

//  Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
//  являются числа, сумма цифр которых равна К и которые не большее N.

public class Task12 {

    private static int calculateNumbersSum(int n){
        int sum = 0;
        while (n != 0){
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    private static int findNumbersQuantity(int k, int n){
        int quantity = 0;
        for (int i = 1; i <= n; i++) {
            if(calculateNumbersSum(i) == k && i < n){
                quantity++;
            }
        }
        return quantity;
    }

    private static void printArray(int [] array){
        if(array != null) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + "\t");
            }
        }
    }

    private static int [] doTask12 (int k, int n){
        if(k > 0 && n > 0){
        int [] array = new int [findNumbersQuantity(k, n)];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (calculateNumbersSum(i) == k && i < n){
                array [index] = i;
                index++;
            }
        }
        return array;
        } else {
            System.out.println("По условию k и n - натуральные числа." +
                               " Проверьте введённые данные и перезапустите программу.");
            return null;
        }
    }

    public static void main(String[] args) {

        int [] array = Task12.doTask12(7, 231);
        Task12.printArray(array);

    }


}
