package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_10.additional_class;

public class Time implements Comparable<Time>{

    private int hours;
    private int minutes;

    public Time(int hours, int minutes) {
        if(hours >= 0 && hours < 24){
            this.hours = hours;
        }
        if(minutes >= 0 && minutes < 60){
            this.minutes = minutes;
        }
    }

    @Override
    public String toString() {
        return hours + ":" + minutes;
    }

    @Override
    public int compareTo(Time t) {
        return (hours*60 + minutes) - (t.hours*60 + t.minutes);
    }
}
