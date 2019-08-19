package com.kotenkov.basics_of_oop.task_5.entity.pack;

public class Basket extends Package {

    public Basket() {
        super("basket", "wooden", 10);
    }

    @Override
    public String toString() {
        return "Package " + type;
    }
}
