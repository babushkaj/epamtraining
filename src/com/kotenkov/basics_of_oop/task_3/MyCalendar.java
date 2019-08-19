package com.kotenkov.basics_of_oop.task_3;

//  Создать класс Календарь с внутренним классом, с помощью объектов которого
//  можно хранить информацию о выходных и праздничных днях.

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class MyCalendar extends GregorianCalendar{

    List<SpecialDay> specialDays;

    public MyCalendar() {
        specialDays = new ArrayList<>();
    }

    public void addSpecialDay(GregorianCalendar date, boolean isDayOf, boolean isCelebration, String description){
        SpecialDay sd = createSpecialDay(date, isDayOf, isCelebration,  description);
        specialDays.add(sd);
    }

    public void checkTheDay(GregorianCalendar date){
        StringBuilder sb = prepareStringDescription(date);
        SpecialDay sd = isSpecialDay(date);
        if(!(sd == null)){
            sb.append(sd.description);
            if(sd.isDayOf) {
                sb.append(" DAY OFF ");
                if (sd.isCelebration) {
                    sb.append("and CELEBRATION.");
                }
            } else if(sd.isCelebration){
                sb.append(" CELEBRATION ");
            }
        } else {
            sb.append("It is an usual day.");
        }
        System.out.println(sb.toString());
    }

    private StringBuilder prepareStringDescription(GregorianCalendar date){
        StringBuilder sb = new StringBuilder("The day ");
        sb.append(date.get(DAY_OF_MONTH));
        sb.append(":");
        sb.append(date.get(MONTH) + 1);
        sb.append(":");
        sb.append(date.get(YEAR));
        sb.append(" is ");
        int rightDay = convertDayOfWeek(date.get(DAY_OF_WEEK));
        sb.append(DayOfWeek.of(rightDay).toString().toLowerCase());
        sb.append(". ");
        return sb;
    }

    private int convertDayOfWeek(int day){
        if(day == 1){
            return 7;
        }
        return day - 1;
    }

    private SpecialDay createSpecialDay(GregorianCalendar date, boolean isDayOf,
                                        boolean isCelebration, String description){
        int day = date.get(DAY_OF_MONTH);
        int month = date.get(MONTH);

        SpecialDay sd = new SpecialDay(day, month, isDayOf, isCelebration, description);
        return sd;
    }

    private boolean isWeekendDay(GregorianCalendar date){
        if(date.get(DAY_OF_WEEK) == Calendar.SATURDAY || date.get(DAY_OF_WEEK) == Calendar.SUNDAY){
            return true;
        }
        return false;
    }

    private SpecialDay isSpecialDay(GregorianCalendar date){
        SpecialDay sd = createSpecialDay(date, false, false,  "");
        for (SpecialDay day: specialDays) {
            if(day.equals(sd)){
                if(isWeekendDay(date)){
                    day.isDayOf = true;
                }
                return day;
            }
        }
        return null;
    }

    private class SpecialDay {
        int day;
        int month;
        boolean isDayOf;
        boolean isCelebration;
        String description;

        public SpecialDay(int day, int month, boolean isDayOf, boolean isCelebration, String description) {
            this.day = day;
            this.month = month;
            this.isDayOf = isDayOf;
            this.isCelebration = isCelebration;
            this.description = description;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SpecialDay that = (SpecialDay) o;

            if (day != that.day) return false;
            return month == that.month;
        }

        @Override
        public int hashCode() {
            int result = day;
            result = 31 * result + month;
            return result;
        }
    }


}
