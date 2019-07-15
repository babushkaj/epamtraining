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

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private int airlinesCounter;
    Airline [] airlines;

    public Airport(int size){
        if(size > 0){
            airlines = new Airline[size];
        } else {
            airlines = new Airline[5];
        }
    }

    public Airport(int size, Airline[] airlines) {
        this(size);
        airlinesCounter = 0;

        for (int i = 0; i < airlines.length; i++) {
            if(airlines[i] != null && airlinesCounter < this.airlines.length){
                airlinesCounter++;
                this.airlines[airlinesCounter-1] = airlines[i];
            } else {
                System.out.println("Only " + this.airlines.length + " airlines have been added.");
                break;
            }
        }
    }

    public void addAirline(Airline a){
        if(airlinesCounter < this.airlines.length && a != null){
            airlinesCounter++;
            this.airlines[airlinesCounter-1] = a;
        } else {
            System.out.println("Airline haven't been added.");
        }
    }

    public void deleteLastAirline(){
        if(airlinesCounter > 0){
            this.airlines[airlinesCounter-1] = null;
            airlinesCounter--;
        } else {
            System.out.println("Airline haven't been deleted.");
        }
    }

    public void printAirlines(){
        for (Airline a: airlines) {
            System.out.println(a);
        }
    }

    public List<Airline> getAirlinesByFinalDestination(String finalDestination){
        List<Airline> list = new ArrayList<>();

        if(finalDestination != null){
            for (int i = 0; i < airlines.length; i++) {
                if(airlines[i].getFinalDestination().equalsIgnoreCase(finalDestination)){
                    list.add(airlines[i]);
                }
            }
        }

        return list;
    }

    public List<Airline> getAirlinesByDepartureDay(DayOfWeek day){
        List<Airline> list = new ArrayList<>();

        if(day != null){
            for (int i = 0; i < airlines.length; i++) {
                for (int j = 0; j < airlines[i].getDays().length; j++) {
                    if(airlines[i].getDays()[j] == day){
                        list.add(airlines[i]);
                        break;
                    }
                }
            }
        }

        return list;
    }

    public List<Airline> getAirlinesByDepartureDayAndTime(DayOfWeek day, Time time){
        List<Airline> list = new ArrayList<>();

        if(day != null && time != null){
            for (int i = 0; i < airlines.length; i++) {
                if(airlines[i].getDepartureTime().compareTo(time) > 0){
                    for (int j = 0; j < airlines[i].getDays().length; j++) {
                        if(airlines[i].getDays()[j] == day){
                            list.add(airlines[i]);
                            break;
                        }
                    }
                }
            }
        }

        return list;
    }

}
