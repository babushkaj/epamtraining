package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_9.additional_class;

public enum BookBinding {
    HARDCOVER("твёрдый переплёт"),
    SOFTCOVER("мягкий переплёт");

    private String value;

    BookBinding(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
