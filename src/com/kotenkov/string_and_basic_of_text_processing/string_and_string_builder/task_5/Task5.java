package com.kotenkov.string_and_basic_of_text_processing.string_and_string_builder.task_5;

//  Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class Task5 {

    private static int countQuantityOfLetterA(String string){
        int counter = 0;

        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == 'a'){
                counter++;
            }
        }

        return counter;
    }

    private static void doTask5(String string){
        System.out.println("\nКоличество повторений буквы 'а' в строке: " + countQuantityOfLetterA(string));
    }

    public static void main(String[] args) {

        String string = "I created the program to the music of Iron Maiden.";
        Task5.doTask5(string);

    }

}
