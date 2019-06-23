package com.kotenkov.algoritmization.sort.task_8;

//  Даны дроби p1/q1, p2/q2 ... pn/qn (pi, qi - натуральные). Составить программу,
//  которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.

public class MainTask8 {

    public static void main(String[] args) {

        Fraction fr1 = new Fraction(1,5);
        Fraction fr2 = new Fraction(3,7);
        Fraction fr3 = new Fraction(1,2);
        Fraction fr4 = new Fraction(1,3);
        Fraction fr5 = new Fraction(17, 21);

        Fraction [] fractions = {fr1, fr2, fr3, fr4, fr5};

        Task8.doTask8(fractions);

    }

}
