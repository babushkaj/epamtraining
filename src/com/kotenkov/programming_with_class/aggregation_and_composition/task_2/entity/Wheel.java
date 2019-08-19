package com.kotenkov.programming_with_class.aggregation_and_composition.task_2.entity;

import com.kotenkov.programming_with_class.aggregation_and_composition.task_2.additional_enum.WheelStatus;

public class Wheel {

    private int radius;
    private WheelStatus wheelStatus;

    public Wheel(int radius, WheelStatus wheelStatus) {
        this.radius = radius;
        this.wheelStatus = wheelStatus;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public WheelStatus getWheelStatus() {
        return wheelStatus;
    }

    public void setWheelStatus(WheelStatus wheelStatus) {
        this.wheelStatus = wheelStatus;
    }

    @Override
    public String toString() {
        return "Radius of the wheel is " + radius + ". The wheel is " + wheelStatus;
    }
}
