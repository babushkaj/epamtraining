package com.kotenkov.string_and_basic_of_text_processing.string_and_string_builder.task_9;

//  Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
//  Учитывать только английские буквы.

public class Task9 {

    private static int [] countLetters(String string){
        int [] lowerAndUpperCounter = {0,0};

        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) > 96 && string.charAt(i) < 123){
                lowerAndUpperCounter[0]++;
            } else if (string.charAt(i) > 64 && string.charAt(i) < 91){
                lowerAndUpperCounter[1]++;
            }
        }

        return lowerAndUpperCounter;
    }

    private static void doTask9(String string){
        System.out.println("\nВведённая строка:\n");
        System.out.println(string);
        System.out.println("\nКоличество английских строчных букв: " + countLetters(string)[0]);
        System.out.println("\nКоличество английских прописных букв: " + countLetters(string)[1]);
    }

    public static void main(String[] args) {

        String string = "THeRe arE 28 loWERcaCe anD 19 upPErCaSe leTTers in thE phrASE. (" +
                        "Считаются только английские буквы!)";
        Task9.doTask9(string);

    }

}
