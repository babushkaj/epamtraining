package com.kotenkov.algoritmization.sort.task_8;

public class Fraction {

    private int p;
    private int q;
    private int multiplier;

    public Fraction(int p, int q) {
        if(p > 0 && q > 0){
            this.p = p;
            this.q = q;
        } else {
            System.out.println("По условию, p и q - натуральные числа. Введённые Вами данные " +
                               "(p = " + p + ", q = " + q + ") некорректны." +
                               " p и q будут присвоены значения по умолчанию p = 1, q = 1.");
            this.p = 1;
            this.q = 1;
        }
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getQ() {
        return q;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }
}
