package com.kotenkov.basics_of_software_code_development.branching;

//  Найти max{min(a, b), min(c, d)}.

public class Task2 {

    private static int doTask2(int a, int b, int c, int d){
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
            return theFirstMin;
        } else {
            return theSecondMin;
        }
    }

    public static void main(String[] args) {

        int a = 11;
        int b = 12;
        int c = 3;
        int d = 4;

        int result = doTask2(a,b,c,d);
        System.out.println(result);

    }
}
