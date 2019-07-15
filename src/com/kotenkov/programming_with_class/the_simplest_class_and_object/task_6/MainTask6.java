package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_6;

//  Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//  изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
//  В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения
//  времени на заданное количество часов, минут и секунд.

public class MainTask6 {

    public static void main(String[] args) {

        Time time = new Time(25, 35, 34);
        System.out.println("Начальное значение:");
        System.out.println(time);
        System.out.println("После увеличения на 2 часа:");
        time.changeHours(2);
        System.out.println(time);
        System.out.println("После увеличения на 25 часов:");
        time.changeHours(25);
        System.out.println(time);
        System.out.println("После уменьшения на 30 часов:");
        time.changeHours(-30);
        System.out.println(time);
        System.out.println("После увеличения на 75 минут:");
        time.changeMinutes(75);
        System.out.println(time);
        System.out.println("После уменьшения на 125 минут:");
        time.changeMinutes(-125);
        System.out.println(time);
        System.out.println("После увеличения на 125 секунд:");
        time.changeSeconds(125);
        System.out.println(time);
        System.out.println("После уменьшения на 3610 секунд:");
        time.changeSeconds(-3610);
        System.out.println(time);

    }

}
