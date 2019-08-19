package com.kotenkov.string_and_basic_of_text_processing.char_array.task_1;

//  Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class Task1 {

    private static String convertWordToSnakeCase(String camelCaseString){
        StringBuilder result = new StringBuilder();
        char [] originalCharArray = camelCaseString.toCharArray();

        for (int i = 0; i < originalCharArray.length; i++) {
            if( Character.isUpperCase(originalCharArray[i])){
               result.append('_');
               result.append(Character.toLowerCase(originalCharArray[i]));
               continue;
            }
            result.append(originalCharArray[i]);
        }

        return result.toString();
    }

    private static String [] convertStringsArrayToSnakeCase(String [] stringsArray){
        String [] snakeCaseArray = new String[stringsArray.length];
        for (int i = 0; i < stringsArray.length; i++) {
            snakeCaseArray[i] = convertWordToSnakeCase(stringsArray[i]);
        }
        return snakeCaseArray;
    }

    private static void printArray(String [] stringsArray){
        for (int i = 0; i < stringsArray.length; i++) {
            System.out.println(stringsArray[i]);
        }
        System.out.println();
    }

    private static void doTask1(String [] stringsArray){
        System.out.println("Camel case:\n");
        printArray(stringsArray);
        String [] snakeCaseArray = convertStringsArrayToSnakeCase(stringsArray);
        System.out.println("Snake case:\n");
        printArray(snakeCaseArray);
    }

    public static void main(String[] args) {

        String [] names = {"oneTwo", "theSecondArgument", "veryLongArgumentName"};
        Task1.doTask1(names);

    }
}
