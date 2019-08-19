package com.kotenkov.programming_with_class.aggregation_and_composition.task_2.entity;

//  Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
//  Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.

import com.kotenkov.programming_with_class.aggregation_and_composition.task_2.additional_enum.FuelLevel;

public class Car {

    private String model;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;
    private Engine engine;
    private FuelLevel fuelLevel;

    public Car() {
    }

    public Car(String model, Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4,
               Engine engine, FuelLevel fuelLevel) {
        this.model = model;
        this.wheel1 = wheel1;
        this.wheel2 = wheel2;
        this.wheel3 = wheel3;
        this.wheel4 = wheel4;
        this.engine = engine;
        this.fuelLevel = fuelLevel;
    }

    public void go(){
        if(engine.startEngine(fuelLevel)){
            System.out.println("This car is going! Brgrggggg!");
        }
    }

    public void fillTheCar(FuelLevel fuelLevel){
        if(fuelLevel != null && fuelLevel != FuelLevel.EMPTY){
            this.fuelLevel = fuelLevel;
            System.out.println("The car was filled.");
        } else {
            System.out.println("The car was'n filled.");
        }
    }

    public void replaceWheel(Wheel wheel, int numberOfWheel){
        if(wheel != null){
            switch (numberOfWheel){
                case 1: {
                    wheel1 = wheel;
                    System.out.println("Wheel1 was replaced!");
                    break;
                }
                case 2: {
                    wheel2 = wheel;
                    System.out.println("Wheel2 was replaced!");
                    break;
                }
                case 3: {
                    wheel3 = wheel;
                    System.out.println("Wheel3 was replaced!");
                    break;
                }
                case 4: {
                    wheel4 = wheel;
                    System.out.println("Wheel4 was replaced!");
                    break;
                }
                default:
                    System.out.println("The car has only four wheels! You have to set correct number of wheel " +
                                       "from 1 to 4. The wheel have not been replaced.");
            }
        }
    }

    public void showModel(){
        System.out.println("A model of this car is " + model);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("A model of this car is " + model + ".\n" +
                  "Wheels:\n" + wheel1 + "\n" + wheel2 + "\n" + wheel3 + "\n" + wheel4 +
                  "\nEngine:\n" + engine + "\nThe level of fuel: " + fuelLevel);
        return sb.toString();
    }
}
