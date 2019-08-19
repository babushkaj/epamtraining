package com.kotenkov.basics_of_oop.task_4.menu;

import com.kotenkov.basics_of_oop.task_4.entity.Cave;
import com.kotenkov.basics_of_oop.task_4.entity.Treasure;
import com.kotenkov.basics_of_oop.task_4.input.InputHandler;

import java.util.ArrayList;
import java.util.List;

public class MenuLogic {

    public static final String HEAD_TEXT = "     Welcome to the Red Dragon's cave!\n" +
            "There are a lot of different treasures here!\n" +
            "    Would you like to take some of them?\n" +
            "         Come on make up your mind!";

    public static final String MENU_TEXT = "\n1. I would like to carefully examine them all.\n" +
            "2. May I ask which of them is the most expensive?\n" +
            "3. I would like to take some of the treasures!\n" +
            "4. Say \"Good bye!\"";

    public static final String HOW_MUCH = "\nWrite the amount:";

    public static final String WHAT_ELSE = "\nIf you need something else, tell me!";

    public static final String GOODBYE = "\nOh, excuse me, I have left milk on my pane! I need to go, bye!";

    public static final String OPTIONS = "\nHow many treasures do you want to take for this amount?\n" +
            "1. I would like as many as possible.\n" +
            "2. I would like as few as possible.\n" +
            "3. I would like o choose them by myself.\n" +
            "4. Sorry, I changed my mind, could we start from the beginning?";

    public static final String NO_TREASURES = "\nThere are no treasures to show.";

    public static final String YOUR_CHOICE = "\nYou have selected next treasures:";

    public static final String NO_CHEAP = "\nThere are no such cheap things here.";

    public static final String MOST_EXPENSIVE = "\nThe most expensive treasure in my cave is:";

    public static final String THANKS = "\nThanks for all the things! I need to go, bye!";

    public static final String TOO_EXPENSIVE = "\nIt is too expensive for you! Select other.";

    private Cave cave;
    private InputHandler ih;

    public MenuLogic(Cave cave) {
        this.cave = cave;
        ih = new InputHandler();
    }

    public void doMenuLogic(){

        System.out.println(HEAD_TEXT);
        System.out.println(MENU_TEXT);
        int menuNum = ih.enterMenuNumber(1,4);

        while (true){
            switch (menuNum){

                case 1:{
                    if(!cave.getTreasures().isEmpty()) {
                        cave.showCavesTreasures();
                    } else {
                        System.out.println(NO_TREASURES);
                    }
                    break;
                }

                case 2:{
                    if(!cave.getTreasures().isEmpty()) {
                        System.out.println(MOST_EXPENSIVE);
                        Treasure t = cave.findTheMostExpensive();
                        System.out.println(t.getDescription() + " it costs " + t.getCost());
                    } else {
                        System.out.println(NO_TREASURES);
                    }
                    break;
                }

                case 3: {
                    if(!cave.getTreasures().isEmpty()){
                        System.out.println(HOW_MUCH);
                        int amount = ih.enterAmount();
                        if(cave.checkMinAmount(amount)){
                            System.out.println(OPTIONS);
                            int choice = ih.enterMenuNumber(1,4);
                            if(choice != 4){
                                List<Treasure> selectedTreasures = internalDialog(choice, amount);
                                    System.out.println(YOUR_CHOICE);
                                    cave.showTreasures(selectedTreasures);
                                    cave.deleteSelectedTreasuresFromCave(selectedTreasures);
                                    System.out.println(THANKS);
                            }
                        } else {
                            System.out.println(NO_CHEAP);
                        }
                    } else {
                        System.out.println(NO_TREASURES);
                    }
                    break;
                }

                case 4: {
                    System.out.println(GOODBYE);
                    break;
                }
            }
            if(menuNum == 4){
                break;
            }
            System.out.println(WHAT_ELSE);
            System.out.println(MENU_TEXT);
            menuNum = ih.enterMenuNumber(1,4);
        }
    }

    private List<Treasure> internalDialog(int choice, int amount){
        List<Treasure> list = null;
        switch (choice){
            case 1:{
                list = cave.selectMaxQuantity(amount);
                break;
            }
            case 2:{
                list = cave.selectMinQuantity(amount);
                break;
            }
            case 3:{
                Treasure t = null;
                list = new ArrayList<>();
                List<Treasure> tempTreasures = cave.getTreasuresCopy();
                while(amount >= cave.findTheCheapest(tempTreasures).getCost()){
                    cave.showTreasures(tempTreasures);
                    System.out.println("\nYour amount is " + amount);
                    int num = ih.enterMenuNumber(1, tempTreasures.size());
                    t = tempTreasures.get(num - 1);
                    if(t.getCost() <= amount){
                        list.add(t);
                        tempTreasures.remove(t);
                        amount -= t.getCost();
                    } else {
                        System.out.println(TOO_EXPENSIVE);
                    }
                }
                if(amount != 0){
                    System.out.println(amount + " more left, but there is no such cheap treasure.");
                }
                break;
            }
        }
        return list;
    }

}
