package com.kotenkov.basics_of_software_code_development.branching;

public class Task1 {
    public static void main(String[] args) {
        int cornerOne = 90;
        int cornerTwo = 50;
        if ((cornerOne + cornerTwo) < 180){
            if (((cornerOne + cornerTwo) == 90) || (cornerOne == 90) || (cornerTwo == 90)){
                System.out.println("Такой треугольник существует и является прямоугольным.");
            } else {
                System.out.println("Такой треугольник существует и не является прямоугольным.");
            }
        } else {
            System.out.println("Такой треугольник не существует!!!");
        }
    }
}
