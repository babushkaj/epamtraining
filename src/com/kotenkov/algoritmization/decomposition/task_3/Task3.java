package com.kotenkov.algoritmization.decomposition.task_3;

//  Вычислить площадь правильного шестиугольника со стороной а,
//  используя метод вычисления площади треугольника

public class Task3 {

    private static double calculateAreaOfTriangle(double a){
        double triangleArea = (Math.sqrt(3)*a*a)/4;
        return triangleArea;
    }

    private static double calculateAreaOfHexagon(double a){
        double hexagonArea = 6 * calculateAreaOfTriangle(a);
        return hexagonArea;
    }

    public static void main(String[] args) {

        double s = Task3.calculateAreaOfHexagon(3);
        System.out.println("Площадь шестиугольника: " + s);

    }


}
