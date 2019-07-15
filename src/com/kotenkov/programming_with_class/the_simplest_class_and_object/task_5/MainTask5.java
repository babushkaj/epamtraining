package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_5;

//  Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//  на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
//  произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
//  позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

public class MainTask5 {

    public static void main(String[] args) {

        Counter counter1 = new Counter();
        Counter counter2 = new Counter(1000, 2000);

        System.out.println("Значения счётчиков после инициализации:");
        System.out.println("counter1 = " + counter1.getValue());
        System.out.println("counter2 = " + counter2.getValue());

        for (int i = 0; i < 75; i++) {
            counter1.increaseValue();
            counter2.increaseValue();
        }

        System.out.println("Значения счётчиков после увеличения их значений на 75:");
        System.out.println("counter1 = " + counter1.getValue());
        System.out.println("counter2 = " + counter2.getValue());

        for (int i = 0; i < 50; i++) {
            counter1.reduceValue();
            counter2.reduceValue();
        }

        System.out.println("Значения счётчиков после уменьшения их значений на 50:");
        System.out.println("counter1 = " + counter1.getValue());
        System.out.println("counter2 = " + counter2.getValue());

        for (int i = 0; i < 976; i++) {
            counter1.increaseValue();
            counter2.increaseValue();
        }

        System.out.println("Значения счётчиков после попытки увеличения их значений на 976:");
        System.out.println("counter1 = " + counter1.getValue());
        System.out.println("counter2 = " + counter2.getValue());

    }

}
