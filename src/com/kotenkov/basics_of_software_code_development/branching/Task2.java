package com.kotenkov.basics_of_software_code_development.branching;

public class Task2 {
    public static void main(String[] args) {
        int a = 11;
        int b = 22;
        int c = 3;
        int d = 4;
        int theFirstMin = 0;
        int theSecondMin = 0;

        if (a < b){
            theFirstMin = a;
        } else {
            theFirstMin = b;
        }
        if (c < d){
            theSecondMin = c;
        } else {
            theSecondMin = d;
        }
        if (theFirstMin > theSecondMin){
            System.out.println("Результат вычисления выражения: " + theFirstMin);
        } else {
            System.out.println("Результат вычисления выражения: " + theSecondMin);
        }
    }
}
