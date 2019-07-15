package com.kotenkov.basics_of_software_code_development.branching;

//  Вычислить значение функции:
//  F(x) = x*x - 3*x + 9 при x <= 3
//  F(x) = 1 /(x*x*x + 6) при x > 3

public class Task5 {

    private static void doTask5(int x){
        if (x <= 3){
            System.out.println("F(x) = " + (Math.pow(x, 2) - 3 * x + 9));
        } else {
            System.out.println("F(x) = " + (1/(Math.pow(x, 3) + 6)));
        }
    }

    public static void main(String[] args) {

        int x = 4;

        doTask5(x);

    }
}
