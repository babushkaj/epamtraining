package com.kotenkov.basics_of_software_code_development.cycle;

public class Task8 {
    public static void main(String[] args) {
        int number1 = 12345670;
        int number2 = 9870654;

        //the count of digits in each number
        int digitCount1 = (int)Math.log10(number1)+1;
        int digitCount2 = (int)Math.log10(number2)+1;

        for (int i = digitCount1 - 1; i >= 0; i--) {
            int temp1 = number1 / (int)(Math.pow(10, i));

            int number2temp = number2;
            for (int j = digitCount2 - 1; j >= 0; j--) {
                int temp2 = number2temp / (int)(Math.pow(10, j));
                if(temp1 == temp2){
                    System.out.println("Цифра " + temp1 + " входит в оба заданных числа.");
                }
                number2temp = number2temp % (int)(Math.pow(10, j));
            }
            number1 = number1 % (int)(Math.pow(10, i));
        }
    }
}
