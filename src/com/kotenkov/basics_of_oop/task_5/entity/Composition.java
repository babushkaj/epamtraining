package com.kotenkov.basics_of_oop.task_5.entity;

import com.kotenkov.basics_of_oop.task_5.entity.flower.Flower;
import com.kotenkov.basics_of_oop.task_5.entity.pack.Package;
import com.kotenkov.basics_of_oop.task_5.entity.pack.Paper;

import java.util.ArrayList;
import java.util.List;

public class Composition {

    private List<Flower> flowers;
    private Package pack;

    public Composition() {
        flowers = new ArrayList<>();
        pack = new Paper( "white");
    }

    public void showComposition(){
        if(flowers.isEmpty()){
            System.out.println("\nThere are no flowers in the composition yet...");
        } else {
            System.out.printf("%-5s%-8s%-8s%5s\n", "No", "Flower", "Color", "Cost");
            System.out.println("--------------------------");
            for (int i = 0; i < flowers.size(); i++) {
                Flower f = flowers.get(i);
                System.out.printf("%-5d%-8s%-8s%5d\n", i+1, f.getName(), f.getColor(), f.getCost());
            }
            int packCost = pack.calculatePackageCost(flowers.size());
            int flCost = calculateFlowersCost();
            System.out.println("--------------------------");
            System.out.printf("%-22s%4d\n", "Total flower's cost", flCost);
            System.out.println("--------------------------");
            System.out.printf("%-26s\n", pack.toString());
            System.out.println("--------------------------");
            System.out.printf("%-22s%4s\n", "Package's size", pack.getPackageSize(flowers.size()));
            System.out.println("--------------------------");
            System.out.printf("%-22s%4d\n", "Total package's cost", packCost);
            System.out.println("--------------------------");
            System.out.printf("%-22s%4s\n", "Composition's cost", flCost + packCost);
        }
    }

    public void addFlower(Flower flower){
        if(flower != null){
            flowers.add(flower);
        }
    }

    public void clearComposition(){
        while(!flowers.isEmpty()){
            flowers.remove(0);
        }
        pack.setType("paper");
        pack.setColor("white");
    }

    private int calculateFlowersCost(){
        int cost = 0;

        if(flowers.size() != 0){
            for (Flower f: flowers) {
                cost += f.getCost();
            }
        } else {
            System.out.println("There are no flowers in your composition.");
        }

        return cost;
    }

    public Package getPack() {
        return pack;
    }

    public void setPack(Package pack) {
        this.pack = pack;
    }
}
