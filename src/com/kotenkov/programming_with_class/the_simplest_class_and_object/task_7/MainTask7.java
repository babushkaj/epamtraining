package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_7;

//  Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
//  вычисления площади, периметра и точки пересечения медиан.

public class MainTask7 {

    public static void main(String[] args) {

//        Triangle triangle1 = Triangle.createByTwoSidesAndAngle(10, 7, 60);
//        Triangle triangle1 = Triangle.createBySideAndTwoAngles(10, 45, 30);
        Triangle triangle1 = Triangle.createByThreeSides(10, 7, 5);
        System.out.println(triangle1);
        System.out.println("Perimeter: " + triangle1.calculatePerimeter());
        System.out.println("Area: " + triangle1.calculateArea());
        triangle1.findTheMedianIntersectionPoint();

    }

}
