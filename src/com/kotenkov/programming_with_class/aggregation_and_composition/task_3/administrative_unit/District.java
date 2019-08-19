package com.kotenkov.programming_with_class.aggregation_and_composition.task_3.administrative_unit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class District {

    private String name;
    private City districtCenter;
    private List<City> cities;

    public District(String name, City districtCenter, City ... cities) {
        this.name = name;
        this.districtCenter = districtCenter;
        this.cities = new ArrayList(Arrays.asList(cities));
    }

    public double getArea(){
        double area = 0;
        for (City c: cities) {
            area += c.getArea();
        }
        return area;
    }

    public int getPopulation(){
        int population = 0;
        for (City c: cities) {
            population += c.getPopulation();
        }
        return population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getDistrictCenter() {
        return districtCenter;
    }

    public void setDistrictCenter(City districtCenter) {
        this.districtCenter = districtCenter;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
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
