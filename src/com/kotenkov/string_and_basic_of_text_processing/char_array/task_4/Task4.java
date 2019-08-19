package com.kotenkov.string_and_basic_of_text_processing.char_array.task_4;

//  В строке найти количество чисел.

public class Task4 {

    private static int countTheAmountOfDigits(char [] charsArray){
        int counter = 0;
        boolean flag = true;
        for (int i = 0; i < charsArray.length; i++) {
            if(Character.isDigit(charsArray[i])){
                if(flag){
                    counter++;
                    flag = false;
                } else {
                    continue;
                }
            } else {
                flag = true;
            }
        }
        return counter;
    }

    private static void doTask4(char [] charsArray){
        System.out.println("Количество чисел в строке: " + countTheAmountOfDigits(charsArray));
    }

    public static void main(String[] args) {

        String string = "12 is a number but 1 and 2 are digits";
        char [] array = string.toCharArray();
        Task4.doTask4(array);

    }

}
