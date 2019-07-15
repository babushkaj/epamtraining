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

import java.util.List;

public class MainTask10 {

    public static void main(String[] args) {

        Time depMoscow = new Time(20,30);
        DayOfWeek[] daysMoscow = {DayOfWeek.TUESDAY, DayOfWeek.SATURDAY};
        Airline moscow = new Airline("Москва", "SU1833", "AirbusA320", depMoscow, daysMoscow);

        Time depKiev = new Time(18,20);
        DayOfWeek [] daysKiev = {DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.THURSDAY, DayOfWeek.SATURDAY};
        Airline kiev = new Airline("Киев", "B2845", "Boeing737", depKiev, daysKiev);

        Time depLondon = new Time(10,10);
        DayOfWeek [] daysLondon = {DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY};
        Airline london = new Airline("Лондон", "BA105", "AirbusA380", depLondon, daysLondon);

        Time depParis = new Time(14,40);
        DayOfWeek [] daysParis = {DayOfWeek.FRIDAY, DayOfWeek.SATURDAY, DayOfWeek.SUNDAY};
        Airline paris = new Airline("Париж", "AF231", "Boeing767", depParis, daysParis);

        Time depBerlin = new Time(6,50);
        DayOfWeek [] daysBerlin = {DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY, DayOfWeek.FRIDAY};
        Airline berlin = new Airline("Берлин", "B2101", "AirbusA380", depBerlin, daysBerlin);

        Airline [] airlines = {moscow, kiev, london, paris, berlin};
        Airport airport = new Airport(5, airlines);

        System.out.println("Все рейсы:");
        airport.printAirlines();

        String finalDestination = "Париж";
        System.out.println("\nРейсы до пункта назначения " + finalDestination);
        List<Airline> list = airport.getAirlinesByFinalDestination(finalDestination);
        if(!list.isEmpty()){
            for (Airline a: list) {
                System.out.println(a);
            }
        } else {
            System.out.println("\nРейсов до введённого пункта назначения не найдено.");
        }

        DayOfWeek day = DayOfWeek.FRIDAY;
        System.out.println("\nРейсы в заданный день недели (" + day + ")");
        list = airport.getAirlinesByDepartureDay(day);
        if(!list.isEmpty()){
            for (Airline a: list) {
                System.out.println(a);
            }
        } else {
            System.out.println("\nРейсов на заданный день не найдено.");
        }

        day = DayOfWeek.TUESDAY;
        Time time = new Time(10,20);System.out.println("\nРейсы в заданный день недели (" + day + "), " +
                "время вылета для которых больше заданного (" + time + ")");
        list = airport.getAirlinesByDepartureDayAndTime(day, time);
        if(!list.isEmpty()){
            for (Airline a: list) {
                System.out.println(a);
            }
        } else {
            System.out.println("\nРейсов, время вылета для которых больше заданного, на заданный день не найдено.");
        }
    }

}
