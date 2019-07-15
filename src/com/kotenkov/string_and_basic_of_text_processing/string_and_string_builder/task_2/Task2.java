package com.kotenkov.string_and_basic_of_text_processing.string_and_string_builder.task_2;

//  В строке вставить после каждого символа 'a' символ 'b'.

public class Task2 {

    private static String addBAfterEachA(String string){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            result.append(string.charAt(i));
            if(string.charAt(i) == 'a'){
                result.append('b');
            }
        }

        return result.toString();
    }

    private static void doTask2(String string){
        System.out.println("Исходная строка:\n");
        System.out.println(string + "\n");
        System.out.println("Строка после обработки программой:\n");
        System.out.println(addBAfterEachA(string));
    }

    public static void main(String[] args) {

        String string = "Catalina asked \"How are you?\"";
        Task2.doTask2(string);

    }

}
