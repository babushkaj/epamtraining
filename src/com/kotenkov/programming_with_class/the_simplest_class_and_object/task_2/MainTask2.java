package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_2;

//  Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
//  конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей
//  экземпляра класса.

public class MainTask2 {

    public static void main(String[] args) {

        Test2 testOne = new Test2(1, 2);
        Test2 testTwo = new Test2();

        System.out.println("Значения переменых для testOne. variable1 = " + testOne.getVariable1() +
                           ", variable2 = " + testOne.getVariable2());

        System.out.println("Значения переменых для testTwo. variable1 = " + testTwo.getVariable1() +
                ", variable2 = " + testTwo.getVariable2());

        testOne.setVariable1(1000);
        testOne.setVariable2(2000);
        testTwo.setVariable1(3000);
        testTwo.setVariable2(4000);

        System.out.println("Значения переменых для testOne после их изменения. variable1 = " +
                            testOne.getVariable1() + ", variable2 = " + testOne.getVariable2());

        System.out.println("Значения переменых для testTwo после их изменения. variable1 = " +
                            testTwo.getVariable1() + ", variable2 = " + testTwo.getVariable2());

    }

}
