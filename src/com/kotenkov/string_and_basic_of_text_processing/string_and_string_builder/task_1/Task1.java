package com.kotenkov.string_and_basic_of_text_processing.string_and_string_builder.task_1;

//  Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Task1 {

    private static int countSpaces(String string){
        int counter = 0;
        int max = 0;

        for (int i = 0; i < string.length(); i++) {
                if(Character.isSpaceChar(string.charAt(i))){
                        counter++;
                } else {
                    counter = 0;
                    continue;
                }
                if(counter > max){
                    max = counter;
                }
        }

        return max;
    }

    private static void doTask1(String string){
        System.out.println("Наибольшее количество подряд идущих пробелов в строке: " + countSpaces(string));
    }

    public static void main(String[] args) {

        String string = "   3 spaces    4 spaces  2 spaces     5 spaces";
        Task1.doTask1(string);

    }

}
