package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_10;

//  Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//  и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами
//  и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//        Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//        Найти и вывести:
//        a) список рейсов для заданного пункта назначения;
//        b) список рейсов для заданного дня недели;
//        c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

import com.kotenkov.programming_with_class.the_simplest_class_and_object.task_10.additional_class.DayOfWeek;
import com.kotenkov.programming_with_class.the_simplest_class_and_object.task_10.additional_class.Time;

import java.util.Arrays;

public class Airline {

    private String finalDestination;
    private String flightNumber;
    private String planeType;
    private Time departureTime;
    private DayOfWeek [] days;

    public Airline() {
    }

    public Airline(String finalDestination, String flightNumber, String planeType,
                   Time departureTime, DayOfWeek[] days) {
        this.finalDestination = finalDestination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.departureTime = departureTime;
        this.days = days;
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public void setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public DayOfWeek[] getDays() {
        return days;
    }

    public void setDays(DayOfWeek[] days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "finalDestination = " + finalDestination + ", flightNumber = " + flightNumber +
               ", planeType = " + planeType + ", departureTime = " + departureTime +
               ", days = " + Arrays.toString(days);
    }
}
