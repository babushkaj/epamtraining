package com.kotenkov.algoritmization.decomposition.task_13;

//  Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//  Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
//  Для решения задачи использовать декомпозицию.

public class Task13 {

    private static boolean isSimpleNumber(int n){
        boolean isSimple = true;
        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                isSimple = false;
                break;
            }
        }
        return isSimple;
    }

    private static void doTask13(int n){
        if(n>2){
            for (int i = n; i < 2*n - 1; i++) {
                if(isSimpleNumber(i) && isSimpleNumber(i + 2)){
                    System.out.println("\nЧисла " + i + " и " + (i+2) + " являются \"близнецами\".");
                }
            }
        }else{
            System.out.println("По условию n - натуральное число больше двух." +
                    " Проверьте введённые данные и перезапустите программу.");
        }
    }

    public static void main(String[] args) {

        Task13.doTask13(100);

    }
}
