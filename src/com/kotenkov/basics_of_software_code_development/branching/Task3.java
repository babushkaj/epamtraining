package com.kotenkov.basics_of_software_code_development.branching;

import com.kotenkov.basics_of_software_code_development.additional_class.Point;

public class Task3 {
    public static void main(String[] args) {
        Point pointA = new Point(1, 1);
        Point pointB = new Point(2, 2);
        Point pointC = new Point(3, 3);

        if ((pointA.getX() - pointC.getX()) * (pointB.getY() - pointC.getY()) ==
            (pointB.getX() - pointC.getX()) * (pointA.getY() - pointC.getY())){
            System.out.println("Точки A(" + pointA.getX() + "," + pointA.getY() +
                               ") , B(" + pointB.getX() + " , " + pointB.getY() +
                               ") , C(" + pointC.getX() + " , " + pointC.getY() +
                               ") лежат на одной прямой.");
        } else {
            System.out.println("Точки A(" + pointA.getX() + "," + pointA.getY() +
                    ") , B(" + pointB.getX() + " , " + pointB.getY() +
                    ") , C(" + pointC.getX() + " , " + pointC.getY() +
                    ") не лежат на одной прямой.");
        }


    }
}
