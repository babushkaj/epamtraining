package com.kotenkov.string_and_basic_of_text_processing.regular_expression.task_1.text_pricessing;

import com.kotenkov.string_and_basic_of_text_processing.regular_expression.task_1.part_of_text.Paragraph;
import com.kotenkov.string_and_basic_of_text_processing.regular_expression.task_1.part_of_text.Sentence;
import com.kotenkov.string_and_basic_of_text_processing.regular_expression.task_1.part_of_text.Text;

import java.util.List;

public class TextActions {

    public static void prepareText(Text text){
        text.splitTheTextIntoParagraphs();
        List<Paragraph> pars = text.getParagraphs();
        for (Paragraph p : pars) {
            p.splitTheParagraphIntoSentences();
            List<Sentence> sen = p.getSentences();
            for (Sentence s: sen) {
                s.splitTheSentenceIntoWords();
            }
        }
    }

    public static void sortParagraphsBySentQuantity(String rawText){
        Text text = new Text(rawText);
        prepareText(text);
        text.sortParagraphsBySentQuantity();
        List<Paragraph> par = text.getParagraphs();
        for (Paragraph p: par) {
            System.out.println(p.getText() + "\n");
        }
    }

    public static void sortWordsByLength(String rawText){
        Text text = new Text(rawText);
        prepareText(text);
        List <Paragraph> paragraphs = text.getParagraphs();
        for (Paragraph par: paragraphs) {
            List <Sentence> sentences = par.getSentences();
            for (Sentence sen: sentences) {
                sen.sortWordsByLength();
                for (int i = 0; i < sen.getWords().size(); i++) {
                    System.out.print(sen.getWords().get(i).getWord() + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void sortByDescendingCharacterAndAlphabet(String rawText, char symbol,
                                                            int numberOfPar, int numberOfSent ){

        Text text = new Text(rawText);
        prepareText(text);
        Paragraph paragraph = text.getParagraphs().get(numberOfPar-1);
        Sentence sentence = paragraph.getSentences().get(numberOfSent-1);

        for (int i = 0; i < sentence.getWords().size(); i++) {
            sentence.getWords().get(i).countMatches(symbol);
        }

        sentence.sortByDescendingCharacterAndAlphabet();

        for (int i = 0; i < sentence.getWords().size(); i++) {
            System.out.print(sentence.getWords().get(i).getWord() + " ");
        }
        System.out.println();

        }
    }
