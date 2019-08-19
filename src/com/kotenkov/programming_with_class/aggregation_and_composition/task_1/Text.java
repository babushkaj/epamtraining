package com.kotenkov.programming_with_class.aggregation_and_composition.task_1;

//  Создать объект класса Текст, используя классы Предложение, Слово.
//  Методы: дополнить текст, вывести на консоль текст, заголовок текста.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Text {

    private Sentence title;
    private List<Sentence> sentences;


    public Text(Sentence title, Sentence ... sentences) {
        this.title = title;
        this.sentences = new ArrayList<>(Arrays.asList(sentences));
    }

    public void addText(Sentence ... sent){
        for (Sentence s: sent) {
            sentences.add(s);
        }
    }

    public void printTitle(){
        System.out.println(title);
    }

    public void printText(){
        for (Sentence s: sentences) {
            System.out.print(s);
        }
    }

    public Sentence getTitle() {
        return title;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setTitle(Sentence title) {
        this.title = title;
    }
}
