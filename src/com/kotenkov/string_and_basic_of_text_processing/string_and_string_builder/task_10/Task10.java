package com.kotenkov.string_and_basic_of_text_processing.string_and_string_builder.task_10;

//  Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
//  восклицательным или вопросительным знаком. Определить количество предложений в строке X

public class Task10 {

    private static int countSentences(String text){
        int counter = 0;

        boolean sentenceIsBegun = false;
        for (int i = 0; i < text.length(); i++) {
            int checkedSymbol = text.charAt(i);
            if(checkedSymbol != 33 && checkedSymbol != 46 && checkedSymbol != 63){
                if(sentenceIsBegun){
                    continue;
                } else {
                    sentenceIsBegun = true;
                    counter++;
                }
            } else {
                sentenceIsBegun = false;
                continue;
            }
        }

        return counter;
    }

    private static void doTask10(String text){
        System.out.println("\nВведённый текст:\n");
        System.out.println(text);
        System.out.println("\nКоличество предложений в тексте: " + countSentences(text));
    }

    public static void main(String[] args) {

        String text = "It is our text. How many sentences does it contain? Three!!!";
        Task10.doTask10(text);

    }

}
