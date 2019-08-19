package com.kotenkov.basics_of_oop.task_4.input;

import java.util.Scanner;

public class InputHandler {

    Scanner s;

    public InputHandler() {
        s = new Scanner(System.in);
    }

    public int enterMenuNumber(int from, int to){
        int number = 0;

        while (!(number >= from && number <= to)) {
            System.out.println("\nEnter number from " + from + " to " + to + ":");
            while (!s.hasNextInt()) {
                s.next();
                System.out.println("\nEnter number from " + from + " to " + to + ":");
            }

            number = s.nextInt();

            if (number >= from && number <= to) {
                break;
            }
        }

        return number;
    }

    public int enterAmount(){
        int number = 0;

        while (!(number > 0)) {
            System.out.println("\nEnter amount (number is greater than zero):");
            while (!s.hasNextInt()) {
                s.next();
                System.out.println("\nEnter amount (number is greater than zero):");
            }

            number = s.nextInt();

            if (number > 0) {
                break;
            }
        }

        return number;
    }


}
