package com.kotenkov.string_and_basic_of_text_processing.string_and_string_builder.task_4;

//  С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class Task4 {

    private static String makeNewWord(String string){
        String wordCake = string.substring(7,8) +
                          string.substring(3,4) +
                          string.substring(4,5) +
                          string.substring(7,8);
        return wordCake;
    }

    private static void doTask4(){
        String string = "информатика";
        System.out.println("Слово \"торт\": " + makeNewWord(string));
    }

    public static void main(String[] args) {

        doTask4();

    }

}
