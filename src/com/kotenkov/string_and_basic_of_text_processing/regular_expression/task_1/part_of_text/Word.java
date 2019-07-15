package com.kotenkov.string_and_basic_of_text_processing.regular_expression.task_1.part_of_text;

public class Word {
    private String word;
    private int matchesCounter;

    public void countMatches(char symbol){
        matchesCounter = 0;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == symbol){
                matchesCounter++;
            }
        }
    }

    public Word(String word){
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public int getMatchesCounter() {
        return matchesCounter;
    }

}
