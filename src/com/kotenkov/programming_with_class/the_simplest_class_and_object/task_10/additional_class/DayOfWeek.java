package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_10.additional_class;

public enum DayOfWeek {
    MONDAY("Пн."),
    TUESDAY("Вт."),
    WEDNESDAY("Ср."),
    THURSDAY("Чт."),
    FRIDAY("Пт."),
    SATURDAY("Сб."),
    SUNDAY("Вс.");

    private String value;

    DayOfWeek(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
