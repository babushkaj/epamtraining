package com.kotenkov.basics_of_oop.task_4.entity;

public class Treasure {

    private int cost;
    private String description;

    public Treasure(int cost, String description) {
        this.cost = cost;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "[ description = " + description + ", cost = " + cost + "]";
    }
}
