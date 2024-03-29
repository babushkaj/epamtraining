package com.kotenkov.algoritmization.decomposition.task_11;

//  Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Task11 {

    private static int calculateNumbersLength(int number){
        int length = 0;
        do{
            number = number/10;
            length++;
        } while (number != 0);
        return length;
    }

    private static void doTask11(int a, int b){
        if(calculateNumbersLength(a) > calculateNumbersLength(b)){
            System.out.println("\nВ числе " + a + " больше цифр, чем в числе " + b + ".");
        } else if (calculateNumbersLength(b) > calculateNumbersLength(a)){
            System.out.println("\nВ числе " + a + " меньше цифр, чем в числе " + b + ".");
        } else {
            System.out.println("\nВ числах " + a + " и " + b + " одинаковое количество цифр.");
        }
    }

    public static void main(String[] args) {

        Task11.doTask11(1234, 12345);
        Task11.doTask11(12340, 1234);
        Task11.doTask11(12340, 12345);

    }

}
