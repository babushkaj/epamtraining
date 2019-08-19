package com.kotenkov.string_and_basic_of_text_processing.string_and_string_builder.task_6;

//  Из заданной строки получить новую, повторив каждый символ дважды.

public class Task6 {

    private static String createNewString(String string){
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            newString.append(string.charAt(i));
            newString.append(string.charAt(i));
        }

        return newString.toString();
    }

    private static void doTask6(String string){
        if(string != null){
            System.out.println("\nИсходная строка:\n");
            System.out.println(string);
            System.out.println("\nНовая строка:\n");
            System.out.println(createNewString(string));
        } else {
            System.out.println("Строка должна быть инициализирована! Проверьте значение вводимой строки и" +
                               " перезапустите программу!");
        }
    }

    public static void main(String[] args) {

        String string = "I like riding my bike!";
        Task6.doTask6(string);

    }

}
