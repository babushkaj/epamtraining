package com.kotenkov.basics_of_software_code_development.branching;

public class Task5 {
    private static int x = 3;

    public static void main(String[] args) {
        if (x <= 3){
            System.out.println("F(x) = " + (Math.pow(x, 2) - 3 * x + 9));
        } else {
            System.out.println("F(x) = " + (1/(Math.pow(x, 3) + 6)));
        }
    }
}
