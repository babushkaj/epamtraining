package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_4;

//  Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//  Создайте массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
//  по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен
//  пользователем. Добавьте возможность сортировки массив по пункту назначения, причем поезда с
//  одинаковыми пунктами назначения должны быть упорядочены по времени отправления.

public class MainTask4 {

    public static void main(String[] args) {

        Terminal t = new Terminal();
        t.showAllTrains();
        System.out.println("=======================================================" +
                           "\nСортировка по номерам:");
        t.sortTrainsByNumbers();
        t.showAllTrains();
        System.out.println("=======================================================" +
                           "\nСортировка по пункту назначения и времени отправления:");
        t.sortTrainsByFinalDestAndDepTime();
        t.showAllTrains();
        System.out.println("=======================================================");
        t.getInformationAboutTrain();

    }

}
