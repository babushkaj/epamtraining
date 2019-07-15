package com.kotenkov.string_and_basic_of_text_processing.string_and_string_builder.task_3;

//  Проверить, является ли заданное слово палиндромом.

public class Task3 {

    private static boolean checkTheWord(String string){
        boolean answer = true;

        for (int i = 0; i < string.length()/2 + 1; i++) {
            if(!(string.charAt(i) == string.charAt(string.length() - 1 - i))){
                answer = false;
                break;
            }
        }

        return answer;
    }

    private static void doTask3(String string){
        if(checkTheWord(string)){
            System.out.println("Заданное слово является палиндромом.");
        } else {
            System.out.println("Заданное слово не является палиндромом.");
        }
    }

    public static void main(String[] args) {

        String string = "топот";
        Task3.doTask3(string);

    }
}
