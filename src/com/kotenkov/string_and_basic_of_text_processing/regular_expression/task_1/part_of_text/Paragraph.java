package com.kotenkov.string_and_basic_of_text_processing.regular_expression.task_1.part_of_text;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Paragraph implements Comparable<Paragraph>{
    private String text;

    private List<Sentence> sentences = new ArrayList<>();

    public Paragraph(String text) {
        this.text = text;
    }

    public void splitTheParagraphIntoSentences(){
        Pattern seqPattern = Pattern.compile("[A-Z\\d].?[\\w\\s,;:\\-\"]+[.!?]+");
        Matcher m = seqPattern.matcher(text);
        while (m.find()){
            sentences.add(new Sentence(text.substring(m.start(),m.end())));
        }
    }

    public String getText() {
        return text;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    @Override
    public int compareTo(Paragraph p) {
        return sentences.size() - p.getSentences().size();
    }
}
