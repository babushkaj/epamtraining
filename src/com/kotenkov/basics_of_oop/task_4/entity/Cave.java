package com.kotenkov.basics_of_oop.task_4.entity;

import java.util.ArrayList;
import java.util.List;

public class Cave {
    List<Treasure> treasures;

    public Cave() {
        treasures = new ArrayList<>();
    }

    public void addTreasure(int cost, String description){
        if(cost > 0 && (description.length() != 0)){
            Treasure t = new Treasure(cost, description);
            treasures.add(t);
        } else {
            System.out.println("\nThe treasure can't be added. Check entered \"cost\" and \"description\".");
        }
    }

    public void showCavesTreasures(){
        showTreasures(this.treasures);
    }

    public void showTreasures(List<Treasure> treasures) {
        System.out.printf("\n%-4s|%-40s|%6s|\n", "No", "         Description", " Cost ");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < treasures.size(); i++) {
            System.out.printf("%-4d|%-40s|%6d|\n", i + 1, treasures.get(i).getDescription(),
                    treasures.get(i).getCost());
        }
    }

    public Treasure findTheMostExpensive(){
        Treasure maxCost = null;
        if(!treasures.isEmpty()){
            maxCost = treasures.get(0);
            for (Treasure t: treasures) {
                if(t.getCost() > maxCost.getCost()){
                    maxCost = t;
                }
            }
        }
        return maxCost;
    }

    public Treasure findTheCheapest(){
        Treasure minCost = null;
        if(!treasures.isEmpty()){
            minCost = treasures.get(0);
            for (Treasure t: treasures) {
                if(t.getCost() < minCost.getCost()){
                    minCost = t;
                }
            }
        }
        return minCost;
    }

    public Treasure findTheCheapest(List<Treasure> treasures){
        Treasure minCost = null;
        if(!treasures.isEmpty()){
            minCost = treasures.get(0);
            for (Treasure t: treasures) {
                if(t.getCost() < minCost.getCost()){
                    minCost = t;
                }
            }
        }
        return minCost;
    }

    public List<Treasure> incrementalSort(){
        List<Treasure> newList = getTreasuresCopy();

        for (int i = 0; i < newList.size() - 1; i++) {
            for (int j = 0; j < newList.size() - i - 1; j++) {
                if(newList.get(j).getCost() > newList.get(j+1).getCost()){
                    swap(newList, j, j+1);
                }
            }
        }

        return newList;
    }

    public List<Treasure> descendingSort(){
        List<Treasure> newList = getTreasuresCopy();

        for (int i = 0; i < newList.size() - 1; i++) {
            for (int j = 0; j < newList.size() - i - 1; j++) {
                if(newList.get(j).getCost() < newList.get(j+1).getCost()){
                    swap(newList, j, j+1);
                }
            }
        }

        return newList;
    }

    public boolean checkMinAmount(int amount){
        if(amount < findTheCheapest().getCost()){
            return false;
        }
        return true;
    }

    public List<Treasure> selectMaxQuantity(int amount){
        List<Treasure> newList = new ArrayList<>();
        List<Treasure> list = incrementalSort();
        for (int i = 0; i < list.size(); i++) {
            Treasure tr = list.get(i);
            if(amount < tr.getCost()){
                if(amount != 0){
                    System.out.println(amount + " more left, but there is no such cheap treasure.");
                }
                break;
            }
            newList.add(tr);
            amount -= tr.getCost();
        }
        if(amount != 0){
            System.out.println(amount + " more left, but there are no treasures in the cave.");
        }
        return newList;
    }

    public List<Treasure> selectMinQuantity(int amount){
        List<Treasure> newList = new ArrayList<>();
        List<Treasure> list = descendingSort();
        int minCost = findTheCheapest().getCost();
        for (int i = 0; i < list.size(); i++) {
            if(amount < minCost){
                System.out.println(amount + " more left, but there is no such cheap treasure.");
                break;
            }
            Treasure tr = list.get(i);
            if(amount >= tr.getCost()){
                newList.add(tr);
                amount -= tr.getCost();
            } else {

            }
        }
        if(amount != 0){
            System.out.println(amount + " more left, but there are no treasures in the cave.");
        }
        return newList;
    }

    public void deleteSelectedTreasuresFromCave(List<Treasure> selected){
        treasures.removeAll(selected);
    }

    private void swap(List<Treasure> list, int i, int j){
        Treasure tmp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tmp);
    }

    public List<Treasure> getTreasuresCopy(){
        if(!treasures.isEmpty()){
            List<Treasure> copy = new ArrayList<>();
            for (Treasure t:treasures) {
                copy.add(t);
            }
            return copy;
        } else {
            System.out.println("There are no treasures in the cave.");
            return null;
        }
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }

}
