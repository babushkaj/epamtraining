package com.kotenkov.algoritmization.decomposition.task_4;

//  На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие,
//  между какими из пар точек самое большое расстояние. Указание: координаты точек занести в массив.

public class Task4 {

    private static double calculateDistanceBetweenTwoPoints(int [] coordA, int [] coordB){
        double distance = Math.sqrt(Math.pow(coordA[0] - coordB[0],2) + Math.pow(coordA[1] - coordB[1],2));
        return distance;
    }

    private static int calculateFactorial(int number){
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    private static int calculateQuantityOfDifferentCombinations(int [][] coordinates){
        int result = calculateFactorial(coordinates.length)/
                (calculateFactorial(coordinates.length - 2)*calculateFactorial(2));
        return result;
    }

    private static double [][] calculateAllDistances(int [][] coordinates){
        double [][] allDistances = new double[calculateQuantityOfDifferentCombinations(coordinates)][3];
        int allRowNumber = 0;

        for (int i = 0; i < coordinates.length - 1; i++) {
            for (int j = i+1; j < coordinates.length; j++) {
                allDistances[allRowNumber][0] = i;
                allDistances[allRowNumber][1] = j;
                allDistances[allRowNumber][2] = calculateDistanceBetweenTwoPoints(coordinates[i],coordinates[j]);
                allRowNumber++;
            }
        }

        return allDistances;
    }

    private static double finMaxDistance(double [][] allDistances){
        double max = allDistances[0][2];

        for (int i = 1; i < allDistances.length; i++) {
            if(allDistances[i][2] > max){
                max = allDistances[i][2];
            }
        }

        return max;
    }

    private static void doTask4(int [][] coordinates){
        double [][] allDistances = calculateAllDistances(coordinates);
        double max = finMaxDistance(allDistances);

        for (int i = 0; i < allDistances.length; i++) {
            if(allDistances[i][2] == max){
                int pointA = (int)allDistances[i][0];
                int pointB = (int)allDistances[i][1];
                System.out.println("Самое большое расстояние (" + max + ") между точками с координатами (" +
                                   coordinates[pointA][0] + "," + coordinates[pointA][1] + ") и (" +
                                   coordinates[pointB][0] + "," + coordinates[pointB][1] + ")." );
            }
        }
    }

    public static void main(String[] args) {

        int [][] coordinates = {{-1,1},
                                {2,2},
                                {3,-7},
                                {7,8},
                                {-7,8}};

        doTask4(coordinates);
    }

}

