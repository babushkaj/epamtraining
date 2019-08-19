package com.kotenkov.string_and_basic_of_text_processing.regular_expression.task_2;

public class Event {


    public void startElement(String name, String attrName, String attrContent){
        System.out.println("Открывающий тег: " + name);
        System.out.println("Атрибут тега " + name + ": " + attrName);
        System.out.println("Значение атрибута " + attrName + ": " + attrContent );
    }

    public void startElement(String name){
        System.out.println("Открывающий тег: " + name);
    }

    public void endElement(String name){
        System.out.println("Закрывающий тег: " + name);
    }

    public void noBodyElement(String name){
        System.out.println("Тег без тела: " + name);
    }

    public void tagContent(String content){
        System.out.println("Содержимое тега: " + content);
    }

}
