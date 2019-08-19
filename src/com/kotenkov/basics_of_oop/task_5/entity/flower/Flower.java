package com.kotenkov.basics_of_oop.task_5.entity.flower;

public abstract class Flower {
    private String name;
    private String color;
    private int cost;

    public Flower(String name, String color, int cost) {
        this.name = name;
        this.color = color;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Flower: " + name + ", color: " + color + ", cost " + cost;
    }
}
