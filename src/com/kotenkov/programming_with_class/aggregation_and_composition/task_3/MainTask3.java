package com.kotenkov.programming_with_class.aggregation_and_composition.task_3;

//  Создать объект класса Государство, используя классы Область, Район, Город.
//  Методы: вывести на консоль столицу, количество областей, площадь, областные центры.

import com.kotenkov.programming_with_class.aggregation_and_composition.task_3.administrative_unit.City;
import com.kotenkov.programming_with_class.aggregation_and_composition.task_3.administrative_unit.District;
import com.kotenkov.programming_with_class.aggregation_and_composition.task_3.administrative_unit.Region;
import com.kotenkov.programming_with_class.aggregation_and_composition.task_3.administrative_unit.State;

public class MainTask3 {

    public static void main(String[] args) {
        City northern1 = new City("Northern1", 122.231, 30345);
        City northern2 = new City("Northern2", 90.12, 20987);
        City northern3 = new City("Northern3", 50.321, 9876);

        City northern4 = new City("Northern4", 140.25, 35225);
        City northern5 = new City("Northern5", 70.1, 15658);
        City northern6 = new City("Northern6", 100.3, 25099);

        District northernDis1 = new District("NorthernDis1", northern1, northern1,northern2, northern3);
        District northernDis2 = new District("NorthernDis2", northern4, northern4,northern5, northern6);

        Region northernReg = new Region("NorthernReg", northern1, northernDis1, northernDis2);


        City southern1 = new City("Southern1", 101.231, 28090);
        City southern2 = new City("Southern2", 80.1, 19200);
        City southern3 = new City("Southern3", 55.341, 12213);

        City southern4 = new City("Southern4", 120.25, 31125);
        City southern5 = new City("Southern5", 90.1, 22668);
        City southern6 = new City("Southern6", 110.3, 27079);

        District southernDis1 = new District("SouthernDis1", southern1, southern1,southern2, southern3);
        District southernDis2 = new District("SouthernDis2", southern4, southern4,southern5, southern6);

        Region southernReg = new Region("SouthernReg", southern1, southernDis1, southernDis2);

        State state = new State("North and South State", northern1, northernReg, southernReg);

        System.out.println("\nThe capital of " + state.getName() + " is " + state.getCapital().getName());
        System.out.println("\nNumber of regions of the state: " + state.regionsCount());
        System.out.println("\nThe area of the whole state: " + state.getArea() + "\n");
        state.showRegionsCenters();

    }

}
