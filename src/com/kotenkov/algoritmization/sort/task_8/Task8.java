package com.kotenkov.algoritmization.sort.task_8;

public class Task8 {

    private static int findCommonDenominator(Fraction [] fractions){
        int denominator = 1;

        for (int i = 0; i < fractions.length; i++) {
            denominator *= fractions[i].getQ();
        }

        return denominator;
    }

    private static void toCommonDenominator(Fraction [] fractions){
        int denominator = findCommonDenominator(fractions);

        for (int i = 0; i < fractions.length; i++) {
            fractions[i].setMultiplier(denominator/fractions[i].getQ());
            fractions[i].setP(fractions[i].getP() * fractions[i].getMultiplier());
        }

    }

    private static void sortFractions(Fraction [] fractions){
        boolean needIteration = true;

        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < fractions.length; i++) {
                if (fractions[i].getP() < fractions[i - 1].getP()) {
                    Fraction tmp = fractions[i];
                    fractions[i] = fractions[i-1];
                    fractions[i-1] = tmp;
                    needIteration = true;
                }
            }
        }
    }

    private static void returnFractionsToTheirOriginalForm(Fraction [] fractions){
        for (int i = 0; i < fractions.length; i++) {
            fractions[i].setP(fractions[i].getP()/fractions[i].getMultiplier());
        }
    }

    private static void printFractions(Fraction [] fractions){
        for (int i = 0; i < fractions.length; i++) {
            System.out.print(fractions[i].getP() + "/" + fractions[i].getQ() + "\t");
        }
        System.out.println("\n");
    }

    public static void doTask8(Fraction [] fractions){

        System.out.println("Исходный порядок дробей:\n");
        printFractions(fractions);

        toCommonDenominator(fractions);
        sortFractions(fractions);
        returnFractionsToTheirOriginalForm(fractions);

        System.out.println("Порядок дробей после сортировки:\n");
        printFractions(fractions);

    }



}
