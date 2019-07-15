package com.kotenkov.string_and_basic_of_text_processing.regular_expression.task_1;

import com.kotenkov.string_and_basic_of_text_processing.regular_expression.task_1.part_of_text.Text;

import java.util.Scanner;

public class MainMenu {

    private String rawText;
    private Text text;
    private static int usersChoice = -1;

    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    String menuText = "Выберите необходимое действие:\n" +
                      "1 - Сортировать абзацы по количеству предложений.\n" +
                      "2 - В каждом предложении отсортировать слова по длине.\n" +
                      "3 - Отсортировать слова в предложении по убыванию  количества\n" +
                      "    вхождений заданного символа, а в случае равенства – по алфавиту.\n" +
                      "4 - Показать исходный текст.\n" +
                      "0 - Выход.\n";

    public MainMenu(String rawText) {
        if(rawText != null){
            this.rawText = rawText;
            text = new Text(this.rawText);
            TextActions.prepareText(text);
        } else {
            System.out.println("Строка не была инициализирована! Проверьте вводимый текст и " +
                               "перезапустите программу.");
            usersChoice = 0;
        }

    }

    public void callMainMenu(){
        while (usersChoice != 0){
            getUsersAction();
            switch (usersChoice){
                case 1:{
                    System.out.println("Абзацы, отсортированные по количеству предложений:\n");
                    TextActions.sortParagraphsBySentQuantity(rawText);
                    usersChoice = -1;
                    break;
                }
                case 2:{
                    System.out.println("Слова в каждом предложении отсортированы по длине\n");
                    TextActions.sortWordsByLength(rawText);
                    usersChoice = -1;
                    break;
                }
                case 3:{
                    int numberOfParagraph = getNumberOfParagraph(text);
                    int numberOfSentence = getNumberOfSentence(text, numberOfParagraph);
                    char symbol = getChar();
                    System.out.println("Сортируем слова в предложении по убыванию  количества " +
                                       "вхождений символа '" + symbol + "'," +
                                        " а в случае равенства – по алфавиту.");
                    TextActions.sortByDescendingCharacterAndAlphabet(rawText, symbol,
                                                                numberOfParagraph, numberOfSentence);
                    usersChoice = -1;
                    break;
                }
                case 4:{
                    System.out.println(rawText + "\n");
                    usersChoice = -1;
                    break;
                }
                case 0:{
                    System.out.println("Программа завершена.");
                    break;
                }
            }
        }
    }

    private int getUsersAction(){

        while (usersChoice < 0 || usersChoice > 4) {
            System.out.println(menuText);
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println(menuText);
            }

            usersChoice = scanner.nextInt();

            if (usersChoice >= 0 && usersChoice <= 4) {
                break;
            }
        }

        return usersChoice;
    }

    private int getNumberOfParagraph(Text text){
        int numberOfParagraph = 0;
        int quantityOfParagraphs = text.getParagraphs().size();

        while (numberOfParagraph <= 0 || numberOfParagraph > quantityOfParagraphs) {
            System.out.println("Введите номер параграфа от 1 до " + quantityOfParagraphs + ":\n");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Введите номер параграфа от 1 до " + quantityOfParagraphs + ":\n");
            }

            numberOfParagraph = scanner.nextInt();

            if (numberOfParagraph > 0 && numberOfParagraph <= quantityOfParagraphs) {
                break;
            }
        }

        return numberOfParagraph;
    }

    private int getNumberOfSentence(Text text, int numberOfParagraph){
        int numberOfSentence = 0;
        int quantityOfSentences = text.getParagraphs().get(numberOfParagraph-1).getSentences().size();

        while (numberOfSentence <= 0 || numberOfSentence > quantityOfSentences) {
            System.out.println("Введите номер предложения от 1 до " + quantityOfSentences + ":\n");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Введите номер предложения от 1 до " + quantityOfSentences + ":\n");
            }

            numberOfSentence = scanner.nextInt();

            if (numberOfSentence > 0 && numberOfSentence <= quantityOfSentences) {
                break;
            }
        }

        return numberOfSentence;

    }

    private char getChar(){
        char symbol = ' ';
        String string = null;
        while (symbol == ' ') {
            System.out.println("Введите символ для поиска в словах:\n");
            while (!scanner.hasNext("\\w{1}")) {
                scanner.next();
                System.out.println("Введите символ для поиска в словах:\n");
            }

            string = scanner.next("\\w{1}");

            if(string.length() == 1){
                symbol = string.charAt(0);
            }
        }

        return symbol;
    }

}
