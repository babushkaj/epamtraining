package com.kotenkov.basics_of_oop.task_3;

//  Создать класс Календарь с внутренним классом, с помощью объектов которого
//  можно хранить информацию о выходных и праздничных днях.

import java.util.GregorianCalendar;

public class MainTask3 {

    public static void main(String[] args) {

        MyCalendar myCalendar = new MyCalendar();

        GregorianCalendar march8 = new GregorianCalendar(1999, 2, 8);
        GregorianCalendar febr23 = new GregorianCalendar(1999, 1, 23);

        myCalendar.addSpecialDay(march8, true, true, "Today is the holiday of the eighth of March!");
        myCalendar.addSpecialDay(febr23, false, true, "Today is Defender's Day!");

        GregorianCalendar checkMarch8 = new GregorianCalendar(2019, 2, 8);
        GregorianCalendar checkFebr23 = new GregorianCalendar(2019, 1, 23);
        GregorianCalendar checkUsual = new GregorianCalendar(2019, 7, 28);

        myCalendar.checkTheDay(checkMarch8);
        myCalendar.checkTheDay(checkFebr23);
        myCalendar.checkTheDay(checkUsual);
    }

}
