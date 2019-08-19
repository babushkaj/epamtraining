package com.kotenkov.programming_with_class.aggregation_and_composition.task_3.administrative_unit;

public class City {

    private String name;
    private double area;
    private int population;

    public City(String name, double area, int population) {
        this.name = name;
        this.area = area;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name = ");
        sb.append(name);
        sb.append(", area = ");
        sb.append(area);
        sb.append(", population = ");
        sb.append(population);
        return sb.toString();
    }
}
