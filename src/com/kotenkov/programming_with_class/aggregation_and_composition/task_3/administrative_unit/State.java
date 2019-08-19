package com.kotenkov.programming_with_class.aggregation_and_composition.task_3.administrative_unit;

//  Создать объект класса Государство, используя классы Область, Район, Город.
//  Методы: вывести на консоль столицу, количество областей, площадь, областные центры.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class State {

    private String name;
    private City capital;
    private List<Region> regions;

    public State(String name, City capital, Region ... regions) {
        this.name = name;
        this.capital = capital;
        this.regions = new ArrayList(Arrays.asList(regions));
    }

    public void showRegionsCenters(){
        System.out.print("Regions' centers: ");
        for (Region r: regions) {
            System.out.print(r.getRegionCenter().getName() + " ");
        }
    }

    public int regionsCount(){
        return regions.size();
    }

    public double getArea(){
        double area = 0;
        for (Region r: regions) {
            area += r.getArea();
        }
        return area;
    }

    public int getPopulation(){
        int population = 0;
        for (Region r: regions) {
            population += r.getPopulation();
        }
        return population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name = ");
        sb.append(name);
        sb.append(", area = ");
        sb.append(getArea());
        sb.append(", population = ");
        sb.append(getPopulation());
        return sb.toString();
    }
}
