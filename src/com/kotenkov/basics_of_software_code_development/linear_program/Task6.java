package com.kotenkov.basics_of_software_code_development.linear_program;

//  Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//  принадлежит закрашенной области, и false — в противном случае.

public class Task6 {

    //точки по границе области включены в область
    private static void doTask6(int x, int y){
        boolean condition = ((y <= 4 && y > 0) && (x >= -2 && x <= 2)) ||
                            ((y <= 0 && y >= -3) && (x >= -4 && x <= 4));
        if(condition){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }


    public static void main(String[] args) {

        int x = 3;
        int y = -3;

        doTask6(x,y);

    }
}
