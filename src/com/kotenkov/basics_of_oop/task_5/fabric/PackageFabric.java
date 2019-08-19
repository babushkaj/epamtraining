package com.kotenkov.basics_of_oop.task_5.fabric;

import com.kotenkov.basics_of_oop.task_5.entity.pack.Basket;
import com.kotenkov.basics_of_oop.task_5.entity.pack.Package;
import com.kotenkov.basics_of_oop.task_5.entity.pack.Paper;

public class PackageFabric {

    public Package createPackage(String name, String color){
        if(name.equalsIgnoreCase("paper")){
            return new Paper(color);
        } else if (name.equalsIgnoreCase("basket")){
            return new Basket();
        } else {
            throw new RuntimeException("There is no package with the name \"" + name + "\"");
        }
    }

}
