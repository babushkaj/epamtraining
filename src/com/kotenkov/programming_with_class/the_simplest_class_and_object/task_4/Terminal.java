package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_4;

//  Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//  Создайте массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
//  по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен
//  пользователем. Добавьте возможность сортировки массив по пункту назначения, причем поезда с
//  одинаковыми пунктами назначения должны быть упорядочены по времени отправления.

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Terminal {

    private Train train1 = new Train("Самара", 1,
            new GregorianCalendar(2019, 8, 12, 17,39));
    private Train train2 = new Train("Мюнхен", 4,
            new GregorianCalendar(2019, 8, 12, 8,19));
    private Train train3 = new Train("Киев", 3,
            new GregorianCalendar(2019, 8, 12, 22,36));
    private Train train4 = new Train("Брест", 2,
            new GregorianCalendar(2019, 8, 12, 7,54));
    private Train train5 = new Train("Киев", 5,
            new GregorianCalendar(2019, 8, 12, 10,30));

    private Train [] trains = {train1, train2, train3, train4, train5};

    public void getInformationAboutTrain(){
        int quantityOfTrains = trains.length;
        int userInput = getUsersInput(quantityOfTrains);
        for (int i = 0; i < trains.length; i++) {
            if(trains[i].getNumber() == userInput){
                System.out.println(trains[i]);
                break;
            }
        }
    }

    private int getUsersInput(int quantityOfTrains){
        int usersInput = 0;
        Scanner sc = new Scanner(System.in);
        while (usersInput <= 0 || usersInput > quantityOfTrains) {
            System.out.println("Введите номер поезда от 1 до " + quantityOfTrains + ":\n");
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Введите номер поезда от 1 до " + quantityOfTrains + ":\n");
            }

            usersInput = sc.nextInt();

            if (usersInput > 0 && usersInput <= quantityOfTrains) {
                break;
            }
        }

        return usersInput;
    }

    public void showAllTrains(){
        for (Train t:trains) {
            System.out.println(t);
        }
    }

    public void sortTrainsByNumbers(){
        for (int i = 0; i < trains.length - 1; i++) {
            int position = binarySearch(trains, i, trains[i+1]);
            if (position != -1) {
                shift(trains, position, i + 1);
            }
        }
    }

    public void sortTrainsByFinalDestAndDepTime(){
        for (int i = 0; i < trains.length - 1; i++) {
            for (int j = 0; j < trains.length - i - 1; j++) {
                if(trains[j].getFinalDestination().compareTo(trains[j+1].getFinalDestination()) > 0){
                    swap(trains, j, j+1);
                }
            }
        }
        for (int i = 0; i < trains.length - 1; i++) {
            for (int j = 0; j < trains.length - i - 1; j++) {
                if(trains[j].getFinalDestination().compareTo(trains[j+1].getFinalDestination()) == 0 &&
                   trains[j].getDepartureTime().compareTo(trains[j+1].getDepartureTime()) > 0){
                    swap(trains, j, j+1);
                }
            }
        }
    }

    private static int binarySearch(Train [] tr, int end, Train train){
        int start = 0;
        int finish = end;
        int position = -1;

        while(start <= finish){
            int k = (start + finish)/2;
            if((train.getNumber() >= tr[k].getNumber()) && (train.getNumber() < tr[k+1].getNumber())) {
                position = k + 1;
                break;
            } else if (k == 0 && train.getNumber() < tr[k].getNumber()){
                position = 0;
                break;
            } else if (train.getNumber() < tr[k].getNumber()){
                finish = k - 1;
            } else if (train.getNumber() >= tr[k+1].getNumber()){
                start = k + 1;
            }
        }

        return position;
    }

    private static void swap(Train [] tr, int i, int j){
        Train tmp = tr[i];
        tr[i] = tr[j];
        tr[j] = tmp;
    }

    private static void shift(Train [] tr, int i, int j){
        for (int k = j; k > i; k--) {
            swap(tr, k, k-1);
        }
    }

    //    Сортировка поездов по номерам
//    public void sortTrainsByNumbers(){
//        Arrays.sort(trains, new Comparator<Train>() {
//            @Override
//            public int compare(Train o1, Train o2) {
//                return o1.getNumber()-o2.getNumber();
//            }
//        });
//    }

//    Сортировка поездов по пункту назначения и времени
//    public void sortTrainsByFinalDestAndDepTime(){
//        Arrays.sort(trains, new Comparator<Train>() {
//            @Override
//            public int compare(Train o1, Train o2) {
//                return o1.getFinalDestination().compareTo(o2.getFinalDestination());
//            }
//        }.thenComparing(new Comparator<Train>() {
//            @Override
//            public int compare(Train o1, Train o2) {
//                //допустимо привдение к int, т.к. в году 31 536 000 секунд,
//                //что меньше диапазона int, а расписание на 100 лет никто не составляет
//                int res = (int)(o1.getDepartureTime().getTime().getTime() -
//                        o2.getDepartureTime().getTime().getTime());
//                return res;
//            }
//        }));
//    }

}
