package com.kotenkov.string_and_basic_of_text_processing.char_array.task_3;

//  В строке найти количество цифр

public class Task3 {

    private static int countDigits(char [] charsArray){
        int counter = 0;
        for (int i = 0; i < charsArray.length; i++) {
            if(Character.isDigit(charsArray[i])){
                counter++;
            }
        }
        return counter;
    }

    private static void doTask3(char [] charsArray){
        System.out.println("Количество цифр в строке: " + countDigits(charsArray));
    }

    public static void main(String[] args) {

        String string = "12 is a number but 1 and 2 are digits";
        char [] array = string.toCharArray();
        Task3.doTask3(array);

    }

}
