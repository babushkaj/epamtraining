package com.kotenkov.basics_of_software_code_development.linear_program;

public class Task6 {
    //точки по границе области включены в область
    public static void main(String[] args) {
        int x = 3;
        int y = -3;
        if(((y <= 4 && y > 0) && (x >= -2 && x <= 2)) ||
                ((y <= 0 && y >= -3) && (x >= -4 && x <= 4))){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
