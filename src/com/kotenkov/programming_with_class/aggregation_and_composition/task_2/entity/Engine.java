package com.kotenkov.programming_with_class.aggregation_and_composition.task_2.entity;

import com.kotenkov.programming_with_class.aggregation_and_composition.task_2.additional_enum.FuelLevel;
import com.kotenkov.programming_with_class.aggregation_and_composition.task_2.additional_enum.FuelType;

public class Engine {

    private int capacity;
    private FuelType fuelType;

    public Engine(int capacity, FuelType fuelType) {
        this.capacity = capacity;
        this.fuelType = fuelType;
    }

    public boolean startEngine(FuelLevel fuelLevel){
        if(!(fuelLevel == FuelLevel.EMPTY)){
            System.out.println("The engine is started!");
            return true;
        } else {
            System.out.println("The engine can't be started! There is no fuel!");
            return false;
        }
    }

    public void stopEngine(){
        System.out.println("The engine is stopped!");
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Engine: capacity = " + capacity + ", type of fuel = " + fuelType;
    }
}
