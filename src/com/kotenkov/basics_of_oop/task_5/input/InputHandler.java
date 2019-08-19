package com.kotenkov.basics_of_oop.task_5.input;

import java.util.Scanner;

public class InputHandler {

    private final String FLOWERS = "\\s*[Ff][Ll][Oo][Ww][Ee][Rr][Ss]\\s*";
    private final String PACKAGE = "\\s*[Pp][Aa][Cc][Kk][Aa][Gg][Ee]\\s*";
    private final String SHOW = "\\s*[Ss][Hh][Oo][Ww]\\s*";

    private final String LILY_PAT = "\\s*[Ll][Ii][Ll][Yy]\\s*";
    private final String TULIP_PAT = "\\s*[Tt][Uu][Ll][Ii][Pp]\\s*";
    private final String ASTER_PAT = "\\s*[Aa][Ss][Tt][Ee][Rr]\\s*";
    private final String ROSE_PAT = "\\s*[Rr][Oo][Ss][Ee]\\s*";

    private final String RED_COL_PAT = "\\s*[Rr][Ee][Dd]\\s*";
    private final String YELLOW_COL_PAT = "\\s*[Yy][Ee][Ll]{2}[Oo][Ww]\\s*";
    private final String ROSE_COL_PAT = "\\s*[Rr][Oo][Ss][Ee]\\s*";
    private final String WHITE_COL_PAT = "\\s*[Ww][Hh][Ii][Tt][Ee]\\s*";
    private final String BLUE_COL_PAT = "\\s*[Bb][Ll][Uu][Ee]\\s*";

    private final String PAPER = "\\s*[Pp][Aa][Pp][Ee][Rr]\\s*";
    private final String BASKET = "\\s*[Bb][Aa][Ss][Kk][Ee][Tt]\\s*";

    private final String EXIT = "\\s*[Ee][Xx][Ii][Tt]\\s*";
    private final String BACK = "\\s*[Bb][Aa][Cc][Kk]\\s*";
    private final String RESET = "\\s*[Rr][Ee][Ss][Ee][Tt]\\s*";


    Scanner s;

    public InputHandler() {
        s = new Scanner(System.in);
    }

    public String enterOperation(){
        StringBuilder operation = new StringBuilder();

        System.out.println("\nEnter correct operation(flowers, package, show or exit):");
        while (!(s.hasNext(FLOWERS) || s.hasNext(PACKAGE) || s.hasNext(SHOW) ||
                s.hasNext(RESET) || s.hasNext(EXIT))) {
            s.next();
            System.out.println("\nEnter correct operation(flowers, package, show or exit):");
        }

        operation.append(s.next());

        return operation.toString();
    }

    public String enterFlowerName(){
        StringBuilder name = new StringBuilder();

        System.out.println("\nEnter correct flower's name(lily, rose, aster or tulip):");
        while (!(s.hasNext(LILY_PAT) || s.hasNext(TULIP_PAT) || s.hasNext(ROSE_PAT) ||
                 s.hasNext(ASTER_PAT) || s.hasNext(BACK) || s.hasNext(EXIT))) {
            s.next();
            System.out.println("\nEnter correct flower's name(lily, rose, aster or tulip):");
        }

        name.append(s.next());

        return name.toString();
    }

    public String enterFlowerColor(){
        StringBuilder color = new StringBuilder();

        System.out.println("\nEnter correct flower's color(red, yellow, rose, white):");
        while (!(s.hasNext(RED_COL_PAT) || s.hasNext(YELLOW_COL_PAT) || s.hasNext(ROSE_COL_PAT) ||
                s.hasNext(WHITE_COL_PAT) || s.hasNext(BACK) || s.hasNext(EXIT))) {
            s.next();
            System.out.println("\nEnter correct flower's color(red, yellow, rose, white):");
        }

        color.append(s.next());

        return color.toString();
    }

    public String enterPackageType(){
        StringBuilder type = new StringBuilder();

        System.out.println("\nEnter correct package type(paper, basket):");
        while (!(s.hasNext(PAPER) || s.hasNext(BASKET) || s.hasNext(BACK) ||
                s.hasNext(EXIT))) {
            s.next();
            System.out.println("\nEnter correct package type(paper, basket):");
        }

        type.append(s.next());

        return type.toString();
    }

    public String enterPackageColor(){
        StringBuilder color = new StringBuilder();

        System.out.println("\nEnter correct package color(red, yellow, rose, white):");
        while (!(s.hasNext(RED_COL_PAT) || s.hasNext(YELLOW_COL_PAT) || s.hasNext(ROSE_COL_PAT) ||
                s.hasNext(WHITE_COL_PAT) || s.hasNext(BLUE_COL_PAT) || s.hasNext(BACK) || s.hasNext(EXIT))) {
            s.next();
            System.out.println("\nEnter correct package color(red, yellow, rose, white):");
        }

        color.append(s.next());

        return color.toString();
    }


}
