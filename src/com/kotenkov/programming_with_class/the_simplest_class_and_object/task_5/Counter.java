package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_5;

//  Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//  на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
//  произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
//  позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

public class Counter {

    private int value;
    private int maxLimit;
    private int minLimit;

    public Counter( int minLimit, int maxLimit) {
        if(maxLimit <= Integer.MAX_VALUE && maxLimit > 0){
            this.maxLimit = maxLimit;
        }else{
            System.out.println("maxLimit должен быть в диапазоне от 0 до " + Integer.MAX_VALUE +
                               "Будет установлено значение по умолчанию maxLimit = " + Integer.MAX_VALUE + ".");
        }
        if(minLimit >= 0 && minLimit < this.maxLimit){
            this.minLimit = minLimit;
        }else{
            System.out.println("minLimit должен быть в диапазоне от 0 до " + this.maxLimit +
                               "Будет установлено значение по умолчанию minLimit = 0.");
        }
        value = this.minLimit;

    }

    public Counter() {
        this.maxLimit = Integer.MAX_VALUE;
        this.minLimit = 0;
        this.value = 0;
    }

    public void increaseValue(){
        if(value<maxLimit){
            value++;
        }else{
            System.out.println("Невозможно увеличить значение. Достигнут верхний предел.");
        }
    }

    public void reduceValue(){
        if(value>minLimit){
            value--;
        }else{
            System.out.println("Невозможно уменьшить значение. Достигнут нижний предел.");
        }
    }

    public int getValue() {
        return value;
    }
}
