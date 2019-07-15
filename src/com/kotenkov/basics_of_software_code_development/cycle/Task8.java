package com.kotenkov.basics_of_software_code_development.cycle;

//  Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Task8 {

    private static void doTask8(int number1, int number2){
        //the count of digits in each number
        int digitCount1 = (int)Math.log10(number1)+1;
        int digitCount2 = (int)Math.log10(number2)+1;
        int [] digitsMarkers = new int[10];

        for (int i = digitCount1 - 1; i >= 0; i--) {
            int temp1 = number1 / (int)(Math.pow(10, i));
            int number2temp = number2;

            for (int j = digitCount2 - 1; j >= 0; j--) {
                int temp2 = number2temp / (int)(Math.pow(10, j));
                if(temp1 == temp2){
                    digitsMarkers[temp1] = 1;
                    break;
                }
                number2temp = number2temp % (int)(Math.pow(10, j));
            }

            number1 = number1 % (int)(Math.pow(10, i));
        }

        System.out.println("Цифры, входящие в запись как первого так и второго числа:\n");

        for (int i = 0; i < digitsMarkers.length; i++) {
            if(digitsMarkers[i] == 1){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        int number1 = 1234567012;
        int number2 = 987065412;

        doTask8(number1, number2);

    }
}
