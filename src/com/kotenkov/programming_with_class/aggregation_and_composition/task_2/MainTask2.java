package com.kotenkov.programming_with_class.aggregation_and_composition.task_2;

//  Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
//  Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.

import com.kotenkov.programming_with_class.aggregation_and_composition.task_2.additional_enum.FuelLevel;
import com.kotenkov.programming_with_class.aggregation_and_composition.task_2.additional_enum.FuelType;
import com.kotenkov.programming_with_class.aggregation_and_composition.task_2.additional_enum.WheelStatus;
import com.kotenkov.programming_with_class.aggregation_and_composition.task_2.entity.Car;
import com.kotenkov.programming_with_class.aggregation_and_composition.task_2.entity.Engine;
import com.kotenkov.programming_with_class.aggregation_and_composition.task_2.entity.Wheel;

public class MainTask2 {

    public static void main(String[] args) {
        Wheel wheel1 = new Wheel(17, WheelStatus.OK);
        Wheel wheel2 = new Wheel(17, WheelStatus.OK);
        Wheel wheel3 = new Wheel(17, WheelStatus.OK);
        Wheel wheel4 = new Wheel(17, WheelStatus.OK);
        Engine engine = new Engine(3000, FuelType.DIESELFUEL);

        Car car = new Car("Alfa Romeo", wheel1, wheel2, wheel3, wheel4, engine, FuelLevel.EMPTY);
        car.go();
        car.fillTheCar(FuelLevel.FULL);
        car.go();

        Wheel spareWheel = new Wheel(17, WheelStatus.OK);
        car.replaceWheel(spareWheel, 2);
        car.showModel();

    }

}
