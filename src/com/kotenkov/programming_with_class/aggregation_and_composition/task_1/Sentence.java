package com.kotenkov.programming_with_class.aggregation_and_composition.task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence {

    private List<Word> words;

    public Sentence(Word ... words) {
        this.words = new ArrayList<>(Arrays.asList(words));
    }

    public void addWords(Word ... word){
        for (Word w: word) {
            words.add(w);
        }

    }

    public List<Word> getWords() {
        return words;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Word w: words) {
            sb.append(w);
        }
        return sb.toString();
    }
}
