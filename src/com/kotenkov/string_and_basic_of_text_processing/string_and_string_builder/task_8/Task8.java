package com.kotenkov.string_and_basic_of_text_processing.string_and_string_builder.task_8;

//  Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
// Случай, когда самых длинных слов может быть несколько, не обрабатывать.

public class Task8 {

    private static int [] getStartAndLength(String string){
        int counter = 0;
        int start = 0;
        int [] startAndMaxLength = {0,0};
        boolean wordIsBegun = false;

        for (int i = 0; i < string.length(); i++) {
            if(!Character.isSpaceChar(string.charAt(i))){
                if(wordIsBegun){
                    counter++;
                } else {
                    wordIsBegun = true;
                    start = i;
                    counter++;
                }
            } else {
                wordIsBegun = false;
                counter = 0;
                continue;
            }
            if(counter > startAndMaxLength[1]){
                startAndMaxLength[0] = start;
                startAndMaxLength[1] = counter;
            }
        }

        return startAndMaxLength;
    }

    private static String getSubstringByStartAndLength(String string, int [] startAndLength){
        return string.substring(startAndLength[0], startAndLength[0] + startAndLength[1]);
    }

    private static String findTheLongestWord(String string){
        int [] startAndLength = getStartAndLength(string);
        String theLongestWord = getSubstringByStartAndLength(string, startAndLength);
        return theLongestWord;
    }

    private static void doTask8(String string){
        System.out.println("\nИсходная строка:\n");
        System.out.println(string);
        System.out.println("\nСамое длинное слово в строке:\n");
        System.out.println(findTheLongestWord(string));
    }

    public static void main(String[] args) {

        String string = "If I could fly";
        Task8.doTask8(string);

    }

}
