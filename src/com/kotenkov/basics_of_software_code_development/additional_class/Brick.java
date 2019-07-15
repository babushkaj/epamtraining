package com.kotenkov.basics_of_software_code_development.additional_class;

public class Brick {
    private int x;
    private int y;
    private int z;

    public Brick (int x, int y, int z){
        if(x < 0){
            this.x = 1;
        } else {
            this.x = x;
        }

        if(y < 0){
            this.y = 1;
        } else {
            this.y = y;
        }

        if(z < 0){
            this.z = 1;
        } else {
            this.z = z;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}
