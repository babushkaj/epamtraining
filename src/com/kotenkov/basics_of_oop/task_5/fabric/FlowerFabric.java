package com.kotenkov.basics_of_oop.task_5.fabric;

import com.kotenkov.basics_of_oop.task_5.entity.flower.*;

public class FlowerFabric {

    public Flower createFlower(String name, String color){
        if(name.equalsIgnoreCase("lily")){
            return new Lily(color);
        } else if (name.equalsIgnoreCase("tulip")){
            return new Tulip(color);
        } else if (name.equalsIgnoreCase("aster")) {
            return new Aster(color);
        } else if (name.equalsIgnoreCase("rose")){
            return new Rose(color);
        } else {
            throw new RuntimeException("There is no flower with the name \"" + name + "\"");
        }
    }

}
