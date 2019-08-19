package com.kotenkov.string_and_basic_of_text_processing.char_array.task_2;

//  Замените в строке все вхождения 'word' на 'letter'.

public class Task2 {

    private static String replaceWordToLetter(char [] charArray){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            boolean condition = (i < charArray.length - 3) && (charArray[i] == 'w') &&
                                (charArray[i+1] == 'o') && (charArray[i+2] == 'r') && (charArray[i+3] == 'd');
            if(condition){
                result.append("letter");
                i += 3;
            } else {
                result.append(charArray[i]);
            }
        }
        return result.toString();
    }

    private static void printCharsArray(char [] charsArray){
        for (int i = 0; i < charsArray.length; i++) {
            System.out.print(charsArray[i]);
        }
        System.out.println();
    }

    private static void doTask2(char [] charsArray){
        System.out.println("Исходная строка:\n");
        printCharsArray(charsArray);
        System.out.println("\nРезультат:\n");
        System.out.println(replaceWordToLetter(charsArray));
    }

    public static void main(String[] args) {

        String string = "He writes the word but nobody will read this word.";
        char [] array = string.toCharArray();
        Task2.doTask2(array);

    }

}
