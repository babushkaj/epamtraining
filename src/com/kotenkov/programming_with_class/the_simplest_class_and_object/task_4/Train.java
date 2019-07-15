package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_4;

//  Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//  Создайте массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
//  по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен
//  пользователем. Добавьте возможность сортировки массив по пункту назначения, причем поезда с
//  одинаковыми пунктами назначения должны быть упорядочены по времени отправления.

import java.util.Calendar;

public class Train {

    private String finalDestination;
    private int number;
    private Calendar departureTime;

    public Train(String finalDestination, int number, Calendar departureTime) {
        this.finalDestination = finalDestination;
        this.number = number;
        this.departureTime = departureTime;
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public int getNumber() {
        return number;
    }

    public Calendar getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return "Поезд No: " + number +". Пункт назначения: " + finalDestination +
                ". Время отправления: " + departureTime.get(Calendar.HOUR_OF_DAY) + ":" +
                departureTime.get(Calendar.MINUTE);
    }
}
