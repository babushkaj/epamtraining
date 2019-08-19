package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_1;

//  Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//  переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//  наибольшее значение из этих двух переменных.

public class MainTask1 {

    public static void main(String[] args) {

        Test1 test = new Test1();

        test.setVariable1(5);
        test.setVariable2(-5);

        test.printVariables();

        System.out.println("Сумма значений двух переменных равна: " +
                            test.calculateSumOfTwoVariables());

        System.out.println("Наибольшее значение из этих двух переменных: " +
                            test.getTheBiggestFromTwoVariables());

    }

}
