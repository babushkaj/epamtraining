package com.kotenkov.algoritmization.decomposition.task_9;

public class Task9 {

    private static double calculateHalfPerimeter(double x, double y,
                                                 double z, double t){
        double halfPerimeter = (x + y + z + t)/2;
        return halfPerimeter;
    }

    private static boolean isExist(double x, double y,
                                   double z, double t){
        if((z + t) > Math.sqrt(x*x + y*y) && (x != 0) && (y != 0) && (z != 0) && (t != 0)){
            return true;
        } else {
            return false;
        }
    }

    private static double calculateTheArea(double x, double y,
                                           double z, double t){
        if(isExist(x, y, z, t)){
            double p = calculateHalfPerimeter(x, y, z, t);
            return Math.sqrt((p - x) * (p - y) * (p - z) * (p - t));
        } else {
            return 0;
        }
    }

    public static void doTask9(double x, double y,
                               double z, double t){
        if(calculateTheArea(x, y, z, t) == 0){
            System.out.println("\nЧетырехугольник со сторонами " + x + ", " + y + ", " + z + ", " + t +
                               " не существует!\n");
        } else {
            System.out.println("\nПлощадь четырехугольника со сторонами " + x + ", " + y + ", " + z + ", " + t +
                    " равна " + calculateTheArea(x, y, z, t) + "\n");
        }
    }

}
