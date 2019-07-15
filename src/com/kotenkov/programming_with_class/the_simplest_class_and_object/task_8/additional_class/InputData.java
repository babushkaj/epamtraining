package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_8.additional_class;

import java.util.Scanner;

public class InputData {

    private Scanner sc = new Scanner(System.in);

    public String [] getBordersOfCreditCardsNumbers(){
        String [] borders = new String[2];
        StringBuilder from = null;
        StringBuilder to = null;

        while (from == null) {
            System.out.println("\nВведите левый предел для номера карты (16 цифр):");
            while (!sc.hasNext("[\\d]{16}")) {
                sc.next();
                System.out.println("\nВведите левый предел для номера карты (16 цифр):");
            }

            from = new StringBuilder();
            from.append(sc.next());
            break;
        }

        while (to == null) {
            System.out.println("\nВведите правый предел для номера карты (16 цифр):");
            while (!sc.hasNext("[\\d]{16}")) {
                sc.next();
                System.out.println("\nВведите правый предел для номера карты (16 цифр):");
            }

            to = new StringBuilder();
            to.append(sc.next());
            if(to.toString().compareTo(from.toString()) > 0){
                break;
            }else{
                to = null;
            }
        }

        borders[0] = from.toString();
        borders[1] = to.toString();
        return borders;

    }

}
