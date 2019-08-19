package com.kotenkov.string_and_basic_of_text_processing.regular_expression.task_1;

//  Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять
//  с текстом три различных операции: отсортировать абзацы по количеству предложений;
//  в каждом предложении отсортировать слова по длине;
//  отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
//  а в случае равенства – по алфавиту.

import com.kotenkov.string_and_basic_of_text_processing.regular_expression.task_1.menu.MainMenu;

public class StartApplication {

    public static void main(String[] args) {

        String text =  "1. The first-first Paragraph the first sentence." +
                " The first Paragraph: the second sentence?! It is the third sentence here.\n" +
                "The second Paragraph - the first sentence in this paragraph!!!" +
                "The second Paragraph; the \"second\" sentence... ";

        MainMenu menu = new MainMenu(text);
        menu.callMainMenu();

    }

}
