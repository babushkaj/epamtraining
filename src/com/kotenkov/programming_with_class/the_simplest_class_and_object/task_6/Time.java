package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_6;

//  Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//  изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
//  В случае недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения
//  времени на заданное количество часов, минут и секунд.

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        if(hours >= 0 && hours < 25){
            this.hours = hours;
        }
        if(minutes >= 0 && minutes < 60){
            this.minutes = minutes;
        }
        if(seconds >= 0 && seconds < 60 ){
            this.seconds = seconds;
        }
    }

    public void changeHours(int hours){
        int realChange = hours%24;
        while (realChange != 0){
            if(this.hours == 24 && realChange > 0){
                this.hours = 0;
            }
            if(this.hours == 0 && realChange < 0){
                this.hours = 24;
            }
            if(realChange>0){
                realChange--;
                this.hours++;
            }else{
                realChange++;
                this.hours--;
            }
        }
    }

    public void changeMinutes(int minutes){
        int realChange = minutes%60;
        int changeHours = minutes/60;
        changeHours(changeHours);
        while (realChange != 0){
            if(this.minutes == 60 && realChange > 0){
                this.minutes = 0;
            }
            if(this.minutes == 0 && realChange < 0){
                this.minutes = 60;
            }
            if(realChange>0){
                realChange--;
                this.minutes++;
            }else{
                realChange++;
                this.minutes--;
            }
        }
    }

    public void changeSeconds(int seconds){
        int realChange = seconds%60;
        int changeMinutes = seconds/60;
        changeMinutes(changeMinutes);
        while (realChange != 0){
            if(this.seconds == 60 && realChange > 0){
                this.seconds = 0;
            }
            if(this.seconds == 0 && realChange < 0){
                this.seconds = 60;
            }
            if(realChange>0){
                realChange--;
                this.seconds++;
            }else{
                realChange++;
                this.seconds--;
            }
        }
    }

    public void setHours(int hours) {
        if(hours >= 0 && hours < 25){
            this.hours = hours;
        } else {
            this.hours = 0;
        }
    }

    public void setMinutes(int minutes) {
        if(minutes >= 0 && minutes < 60){
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
    }

    public void setSeconds(int seconds) {
        if(seconds >= 0 && seconds < 60 ){
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }
    }

    @Override
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
