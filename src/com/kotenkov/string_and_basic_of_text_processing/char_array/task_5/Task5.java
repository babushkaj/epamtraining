package com.kotenkov.string_and_basic_of_text_processing.char_array.task_5;

//  Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//  Крайние пробелы в строке удалить.

public class Task5 {

    private static String deleteSpaces(char [] charsArray){
        StringBuilder result = new StringBuilder();
        int start = 0;
        int finish = charsArray.length;
        boolean noSpaceAtTheBeginning = true;
        boolean noSpaceAtTheEnd = true;

        while(noSpaceAtTheBeginning || noSpaceAtTheEnd){
            if(Character.isSpaceChar(charsArray[start])){
                start++;
            } else {
                noSpaceAtTheBeginning = false;
            }
            if(Character.isSpaceChar(charsArray[finish - 1])){
                finish--;
            } else {
                noSpaceAtTheEnd = false;
            }
        }

        boolean severalSpacesInARow = true;

        for (int i = start; i < finish; i++) {
            if(Character.isSpaceChar(charsArray[i])){
                if(severalSpacesInARow){
                    result.append(charsArray[i]);
                    severalSpacesInARow = false;
                } else {
                    continue;
                }
            } else {
                result.append(charsArray[i]);
                severalSpacesInARow = true;
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

    private static void doTask5(char [] charsArray){
        printCharsArray(charsArray);
        System.out.println(deleteSpaces(charsArray));
    }

    public static void main(String[] args) {

        String string = "   |a b c   d e   f g|   ";
        char [] array = string.toCharArray();
        Task5.doTask5(array);

    }

}
