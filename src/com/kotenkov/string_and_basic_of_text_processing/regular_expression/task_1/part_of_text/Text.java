package com.kotenkov.string_and_basic_of_text_processing.regular_expression.task_1.part_of_text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    private String text;
    private List<Paragraph> paragraphs = new ArrayList<>();

    public Text(String text) {
        this.text = text;
    }

    public void splitTheTextIntoParagraphs(){
        Pattern paragraphPattern = Pattern.compile("[\\n\\r\\w]{1}[.[^\\n\\r]]+");
        Matcher m = paragraphPattern.matcher(text);
        while (m.find()){
            paragraphs.add(new Paragraph(text.substring(m.start(),m.end()).trim()));
        }
    }

    public void sortParagraphsBySentQuantity(){
        Collections.sort(paragraphs);
    }

    public String getText() {
        return text;
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }
}
