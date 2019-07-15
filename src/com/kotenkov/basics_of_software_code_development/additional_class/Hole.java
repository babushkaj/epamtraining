package com.kotenkov.basics_of_software_code_development.additional_class;

public class Hole {
    private int a;
    private int b;

    public Hole (int a, int b){
        if(a < 0){
            this.a = 1;
        } else {
            this.a = a;
        }

        if(b < 0){
            this.b = 1;
        } else {
            this.b = b;
        }
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
