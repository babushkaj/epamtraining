package com.kotenkov.string_and_basic_of_text_processing.regular_expression.task_1.part_of_text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {
    private String text;
    private List<Word> words = new ArrayList<>();

    public Sentence(String text) {
        this.text = text;
    }

    public void splitTheSentenceIntoWords() {
        Pattern swordPattern = Pattern.compile("[\\w]+[\\w\\-]+");
        Matcher m = swordPattern.matcher(text);
        while (m.find()){
            words.add(new Word(text.substring(m.start(),m.end())));
        }
    }

    public void sortWordsByLength(){
        Collections.sort(words, byLength);
    }

    public void sortByDescendingCharacterAndAlphabet(){
        Collections.sort(words, byDescendingCharacterAndAlphabet);
    }

    Comparator<Word> byDescendingCharacterAndAlphabet = new Comparator<Word>() {
        @Override
        public int compare(Word o1, Word o2) {
            return o2.getMatchesCounter() - o1.getMatchesCounter();
        }
    }.thenComparing(new Comparator<Word>() {
        @Override
        public int compare(Word o1, Word o2) {
            return o1.getWord().compareTo(o2.getWord());
        }
    });

    Comparator<Word> byLength = new Comparator<Word>() {
        @Override
        public int compare(Word o1, Word o2) {
            return o1.getWord().length() - o2.getWord().length();
        }
    };

    public String getText() {
        return text;
    }

    public List<Word> getWords() {
        return words;
    }

}
