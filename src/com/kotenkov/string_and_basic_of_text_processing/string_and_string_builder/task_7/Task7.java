package com.kotenkov.string_and_basic_of_text_processing.string_and_string_builder.task_7;

//  Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например,
//  если было введено "abc cde  def", то должно быть выведено "abcdef".

public class Task7 {

    private static String deleteSpacesAndDuplicates(String string){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            boolean isDuplicate = false;
            if(!Character.isSpaceChar(string.charAt(i))){
                for (int j = 0; j < i; j++) {
                    if(string.charAt(i) == string.charAt(j)){
                        isDuplicate = true;
                        break;
                    } else {
                        continue;
                    }
                }
                if(!isDuplicate){
                    result.append(string.charAt(i));
                }
            } else {
                continue;
            }
        }

        return result.toString();
    }

    private static void doTask7(String string){
        System.out.println("\nИсходная строка:\n");
        System.out.println(string);
        System.out.println("\nСтрока после обработки:\n");
        System.out.println(deleteSpacesAndDuplicates(string));
    }

    public static void main(String[] args) {

        String string = "abc cde  def";
        Task7.doTask7(string);

    }

}
