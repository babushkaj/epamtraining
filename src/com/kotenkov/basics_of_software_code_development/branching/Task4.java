package com.kotenkov.basics_of_software_code_development.branching;

//  Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
//  Определить, пройдет ли кирпич через отверстие.

import com.kotenkov.basics_of_software_code_development.additional_class.Brick;
import com.kotenkov.basics_of_software_code_development.additional_class.Hole;

public class Task4 {

    private static void doTask4(Brick brick, Hole hole){
        boolean condition = (brick.getX() <= hole.getA() && brick.getY() <= hole.getB()) ||
                            (brick.getX() <= hole.getA() && brick.getZ() <= hole.getB()) ||
                            (brick.getY() <= hole.getA() && brick.getX() <= hole.getB()) ||
                            (brick.getY() <= hole.getA() && brick.getZ() <= hole.getB()) ||
                            (brick.getZ() <= hole.getA() && brick.getX() <= hole.getB()) ||
                            (brick.getZ() <= hole.getA() && brick.getY() <= hole.getB());

        if(condition){
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

    public static void main(String[] args) {

        Brick brick = new Brick(1, 3, 5);
        Hole hole = new Hole(3, 2);

        doTask4(brick, hole);

    }
}
