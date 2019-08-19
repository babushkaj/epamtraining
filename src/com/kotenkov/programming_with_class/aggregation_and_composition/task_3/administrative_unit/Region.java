package com.kotenkov.programming_with_class.aggregation_and_composition.task_3.administrative_unit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Region {

    private String name;
    private City regionCenter;
    private List<District> districts;

    public Region(String name, City regionCenter, District ... districts) {
        this.name = name;
        this.regionCenter = regionCenter;
        this.districts = new ArrayList(Arrays.asList(districts));
    }

    public double getArea(){
        double area = 0;
        for (District d: districts) {
            area += d.getArea();
        }
        return area;
    }

    public int getPopulation(){
        int population = 0;
        for (District d: districts) {
            population += d.getPopulation();
        }
        return population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getRegionCenter() {
        return regionCenter;
    }

    public void setRegionCenter(City regionCenter) {
        this.regionCenter = regionCenter;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
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
