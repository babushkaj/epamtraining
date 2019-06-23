package com.kotenkov.basics_of_software_code_development.branching;

import com.kotenkov.basics_of_software_code_development.additional_class.Brick;
import com.kotenkov.basics_of_software_code_development.additional_class.Hole;

public class Task4 {
    public static void main(String[] args) {
        Brick brick = new Brick(1, 3, 5);
        Hole hole = new Hole(2, 2);

        if((brick.getX() <= hole.getA() && brick.getY() <= hole.getB()) ||
           (brick.getX() <= hole.getA() && brick.getZ() <= hole.getB()) ||
           (brick.getY() <= hole.getA() && brick.getX() <= hole.getB()) ||
           (brick.getY() <= hole.getA() && brick.getZ() <= hole.getB()) ||
           (brick.getZ() <= hole.getA() && brick.getX() <= hole.getB()) ||
           (brick.getZ() <= hole.getA() && brick.getY() <= hole.getB())){

            System.out.println("Кирпич размером " + brick.getX() + " x " +
                               brick.getY() + " x " + brick.getZ() +
                               " проходит в отверстие размером " +
                               hole.getA() + " x " + hole.getB());
        } else {
            System.out.println("Кирпич размером " + brick.getX() + " x " +
                    brick.getY() + " x " + brick.getZ() +
                    " не проходит в отверстие размером " +
                    hole.getA() + " x " + hole.getB());
        }
    }
}
