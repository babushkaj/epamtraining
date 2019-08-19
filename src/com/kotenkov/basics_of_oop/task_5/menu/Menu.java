package com.kotenkov.basics_of_oop.task_5.menu;

import com.kotenkov.basics_of_oop.task_5.entity.Composition;
import com.kotenkov.basics_of_oop.task_5.entity.flower.Flower;
import com.kotenkov.basics_of_oop.task_5.entity.pack.Package;
import com.kotenkov.basics_of_oop.task_5.fabric.FlowerFabric;
import com.kotenkov.basics_of_oop.task_5.fabric.PackageFabric;
import com.kotenkov.basics_of_oop.task_5.input.InputHandler;

public class Menu {

    public static final String MAIN_MENU = "\n       Hi! You can create your own composition here.\n\n" +

                                           "                     Let's begin!\n";

    public static final String HELP = "Use words:\n" +
                                      "- \"flowers\", \"package\", \"show\" and \"reset\"\n" +
                                      "  to manage the composition's creation process\n" +
                                      "- \"lily\", \"tulip\", \"aster\" and \"rose\"\n" +
                                      "  to choose type of flower\n" +
                                      "- \"red\", \"yellow\", \"white\" or \"rose\"\n" +
                                      "  to choose a colr of the flower\n" +
                                      "- \"paper\" and \"basket\" to choose package's type\n" +
                                      "- \"red\", \"yellow\", \"white\", \"rose\" or \"blue\"\n" +
                                      "  to choose package's color\n" +
                                      "- \"reset\" to reset your composition (in main menu)\n" +
                                      "- \"back\" to back in main menu\n" +
                                      "- \"exit\" to close the application.\n";

    private static final String GOODBYE = "Bye!";


    private InputHandler ih;
    private StringBuilder operation;
    private FlowerFabric flFabric;
    private PackageFabric pckgFabric;
    private Composition composition;

    public Menu() {
        ih = new InputHandler();
        operation = new StringBuilder();
        flFabric = new FlowerFabric();
        pckgFabric = new PackageFabric();
        composition = new Composition();
    }

    public void showMainMenu(){
        System.out.println(MAIN_MENU);
        System.out.println(HELP);
        operation.append(ih.enterOperation());

        while(true){
            switch (operation.toString().toLowerCase().trim()){
                case "flowers": {
                    operation.delete(0, operation.length());
                    operation.append(selectFlower());
                    break;
                }
                case "package": {
                    operation.delete(0, operation.length());
                    operation.append(selectPackage());
                    break;
                }
                case "show": {
                    composition.showComposition();
                    operation.delete(0, operation.length());
                    operation.append("back");
                    break;
                }
                case "reset": {
                    composition.clearComposition();
                    operation.delete(0, operation.length());
                    operation.append("back");
                    break;
                }
            }
            if(operation.toString().toLowerCase().trim().equalsIgnoreCase("exit")){
                System.out.println(GOODBYE);
                break;
            }
            if(operation.toString().toLowerCase().trim().equalsIgnoreCase("back")){
                operation.delete(0, operation.length());
                operation.append(ih.enterOperation());
            }

        }

    }

    private String selectFlower(){
        String name = ih.enterFlowerName();
        if(name.trim().equalsIgnoreCase("back")){
            return "back";
        }
        if(name.trim().equalsIgnoreCase("exit")){
            return "exit";
        }
        String color = ih.enterFlowerColor();
        if(color.trim().equalsIgnoreCase("back")){
            return "back";
        }
        if(color.trim().equalsIgnoreCase("exit")){
            return "exit";
        }
        Flower f = flFabric.createFlower(name.trim().toLowerCase(),
                                       color.trim().toLowerCase());
        composition.addFlower(f);
        System.out.println(f + " has been added to your composition.");
        return "flowers";
    }

    private String selectPackage(){
        String type = ih.enterPackageType();
        if(type.trim().equalsIgnoreCase("back")){
            return "back";
        }
        if(type.trim().equalsIgnoreCase("exit")){
            return "exit";
        }
        String color = "";
        if(!(type.trim().equalsIgnoreCase("basket"))){
            System.out.println("enter color of package");
            color = ih.enterPackageColor();
            if(color.trim().equalsIgnoreCase("back")){
                return "back";
            }
            if(color.trim().equalsIgnoreCase("exit")){
                return "exit";
            }
        }
        Package p = pckgFabric.createPackage(type.trim().toLowerCase(),
                                              color.trim().toLowerCase());
        System.out.println(p + " has been added to your composition.");
        composition.setPack(p);

        return "back";
    }

}
