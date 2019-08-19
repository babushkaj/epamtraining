package com.kotenkov.programming_with_class.aggregation_and_composition.task_1;

public class Word {

    private String value;

    public Word(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
