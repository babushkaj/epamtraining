package com.kotenkov.basics_of_oop.task_5.entity.pack;

public abstract class Package {

    protected String type;
    protected String color;
    protected int cost;

    public Package(String type, String color, int cost) {
        this.type = type;
        this.color = color;
        this.cost = cost;
    }

    public int calculatePackageCost(int numOfFlowers){
        int cost = this.cost;
        if(numOfFlowers > 0 && numOfFlowers <=10){
            return cost;
        } else if(numOfFlowers > 10 && numOfFlowers <=30){
            return cost * 2;
        } else {
            return cost * 3;
        }
    }

    public String getPackageSize(int numOfFlowers) {
        int cost = this.cost;
        if (numOfFlowers > 0 && numOfFlowers <= 10) {
            return "mini";
        } else if (numOfFlowers > 10 && numOfFlowers <= 30) {
            return "midi";
        } else {
            return "maxi";
        }
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Package " + type + ", color " + color;
    }
}
