package com.kotenkov.algoritmization.decomposition.task_7;

//  Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9

public class Task7 {

    private static int calculateFactorial(int n){
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    private static int doTask7(){
        int result = 0;
        for (int i = 1; i < 10; i+=2) {
            result += calculateFactorial(i);
        }
        return result;
    }

    public static void main(String[] args) {

        int result = Task7.doTask7();
        System.out.println("\nСумма факториалов всех нечетных чисел от 1 до 9 равна " + result);

    }


}
