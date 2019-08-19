package com.kotenkov.programming_with_class.aggregation_and_composition.task_1;

//  Создать объект класса Текст, используя классы Предложение, Слово.
//  Методы: дополнить текст, вывести на консоль текст, заголовок текста.

public class MainTask1 {

    public static void main(String[] args) {

        Word w1 = new Word("Заголовок ");
        Word w2 = new Word("текста!\n");
        Sentence title = new Sentence(w1, w2);

        Word w3 = new Word("Первое ");
        Word w4 = new Word("предложение ");
        Word w5 = new Word("текста. ");
        Sentence theFirst = new Sentence(w3, w4, w5);

        Word w6 = new Word("Здесь ");
        Word w7 = new Word("уже ");
        Word w8 = new Word("второе ");
        Word w9 = new Word("предложение! ");
        Sentence theSecond = new Sentence(w6, w7, w8, w9);

        Text text = new Text(title, theFirst, theSecond);
        text.printTitle();
        text.printText();

        Word w10 = new Word("A ");
        Word w11 = new Word("теперь ");
        Word w12 = new Word("вот ");
        Word w13 = new Word("третье ");
        Word w14 = new Word("предложение! ");
        Sentence theThird = new Sentence(w10, w11, w12, w13, w14);

        text.addText(theThird);
        System.out.println("\n\nТекст после добавления предложения:");
        text.printText();
    }
}
