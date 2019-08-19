package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_7;

//  Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
//  вычисления площади, периметра и точки пересечения медиан.

public class Triangle {
    private double sideAB;
    private double sideBC;
    private double sideCA;

    private double angleA;
    private double angleB;
    private double angleC;

    private Triangle() {
    }

    public static Triangle createByTwoSidesAndAngle(double sideAB, double sideCA, double angleA){
        if(angleA >= 180) {
            angleA = 60;
            sideCA = sideAB;
        }
        double sideBC = Math.sqrt(Math.pow(sideAB,2) + Math.pow(sideCA,2) -
                                2*sideAB*sideCA*Math.cos(angleA*Math.PI/180));
        double angleB = (Math.asin((Math.sin(angleA*Math.PI/180)*sideCA)/sideBC)*180)/Math.PI;
        double angleC = 180 - angleA - angleB;

        Triangle t = new Triangle();
        t.sideAB = sideAB;
        t.sideBC = sideBC;
        t.sideCA = sideCA;
        t.angleA = angleA;
        t.angleB = angleB;
        t.angleC = angleC;

        return t;
    }

    public static Triangle createBySideAndTwoAngles(double sideAB, double angleA, double angleB){
        if(angleA + angleB >= 180){
            angleA = 60;
            angleB = 60;
        }

        double angleC = 180 - angleA - angleB;
        double sideBC = (sideAB*Math.sin(angleA*Math.PI/180))/Math.sin(angleC*Math.PI/180);
        double sideCA = (sideAB*Math.sin(angleB*Math.PI/180))/Math.sin(angleC*Math.PI/180);

        Triangle t = new Triangle();
        t.sideAB = sideAB;
        t.sideBC = sideBC;
        t.sideCA = sideCA;
        t.angleA = angleA;
        t.angleB = angleB;
        t.angleC = angleC;

        return t;
    }

    public static Triangle createByThreeSides(double sideAB, double sideBC, double sideCA){
        if(!(sideAB + sideBC > sideCA && sideBC + sideCA > sideAB && sideAB + sideCA > sideBC)){
           sideBC = sideAB;
           sideCA = sideAB;
        }

        double angleC = Math.acos((Math.pow(sideBC,2) + Math.pow(sideCA,2) - Math.pow(sideAB,2))/
                        (2*sideBC*sideCA))*180/Math.PI;
        double angleA = Math.asin((sideBC*Math.sin(angleC*Math.PI/180))/sideAB)*180/Math.PI;
        double angleB = 180 - angleA - angleC;

        Triangle t = new Triangle();
        t.sideAB = sideAB;
        t.sideBC = sideBC;
        t.sideCA = sideCA;
        t.angleA = angleA;
        t.angleB = angleB;
        t.angleC = angleC;

        return t;
    }

    public double calculatePerimeter(){
        return sideAB + sideBC + sideCA;
    }

    public double calculateArea(){
        return (sideAB*sideCA*Math.sin(angleA*Math.PI/180))/2;
    }

    public void findTheMedianIntersectionPoint(){
        double mAB = Math.sqrt(2*Math.pow(sideBC,2) + 2*Math.pow(sideCA,2) - Math.pow(sideAB,2))/2;
        double mBC = Math.sqrt(2*Math.pow(sideAB,2) + 2*Math.pow(sideCA,2) - Math.pow(sideBC,2))/2;
        double mCA = Math.sqrt(2*Math.pow(sideBC,2) + 2*Math.pow(sideAB,2) - Math.pow(sideCA,2))/2;

        System.out.println("Точка пересечения медиан треугольника находится\n" +
                           "на расстоянии " + mBC*2/3 + " от вершины A,\n" +
                           "на расстоянии " + mCA*2/3 + " от вершины B,\n" +
                           "на расстоянии " + mAB*2/3 + " от вершины C.");
    }

    @Override
    public String toString() {
        return "sideAB = " + sideAB +
                ", sideBC = " + sideBC +
                ", sideCA = " + sideCA +
                ", angleA = " + angleA +
                ", angleB = " + angleB +
                ", angleC = " + angleC;
    }
}
