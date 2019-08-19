package com.kotenkov.programming_with_class.aggregation_and_composition.task_5.travel;

//  Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
//  различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
//  Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

import java.util.ArrayList;
import java.util.List;

public class TravelAgency {

    List<TravelVoucher> travelVouchers;

    public TravelAgency() {
        travelVouchers = new ArrayList<>();
    }

    public TravelVoucher createTravelVoucher(String where, int days, boolean foodIncluded,
                                             TypeOfTransport typeOfTransport, TravelType travelType){
        TravelVoucher tv = new TravelVoucher(where, days, foodIncluded, typeOfTransport, travelType);
        if(!travelVouchers.contains(tv)){
            travelVouchers.add(tv);
            return tv;
        } else {
            System.out.println("The same travel voucher have already existed.");
            return null;
        }
    }

    public List<TravelVoucher> getTravelVouchers() {
        return travelVouchers;
    }

    public List<TravelVoucher> getTravelVouchersByTypeOfTransport(List<TravelVoucher> vouchers,
                                                                  TypeOfTransport typeOfTransport){
        List<TravelVoucher> list = new ArrayList<>();
        for (TravelVoucher tv:vouchers) {
            if(tv.getTransport() == typeOfTransport){
                list.add(tv);
            }
        }
        return list;
    }

    public List<TravelVoucher> getTravelVouchersByTravelType(List<TravelVoucher> vouchers,
                                                             TravelType travelType){
        List<TravelVoucher> list = new ArrayList<>();
        for (TravelVoucher tv:vouchers) {
            if(tv.getTravelType() == travelType){
                list.add(tv);
            }
        }
        return list;
    }

    public List<TravelVoucher> getTravelVouchersByFoodIncluded(List<TravelVoucher> vouchers,
                                                               boolean foodIncluded){
        List<TravelVoucher> list = new ArrayList<>();
        for (TravelVoucher tv:vouchers) {
            if(tv.isFoodIncluded() == foodIncluded){
                list.add(tv);
            }
        }
        return list;
    }

    public List<TravelVoucher> getTravelVouchersByDays(List<TravelVoucher> vouchers,
                                                       int daysFrom, int daysTo){
        List<TravelVoucher> list = new ArrayList<>();
        for (TravelVoucher tv:vouchers) {
            if(tv.getDays() >= daysFrom && tv.getDays() <= daysTo){
                list.add(tv);
            }
        }
        return list;
    }

    public List<TravelVoucher> sortVouchersByTransport(List<TravelVoucher> vouchers){
        for (int i = 0; i < vouchers.size() - 1; i++) {
            for (int j = 0; j < vouchers.size() - i - 1; j++) {
                if(vouchers.get(j).getTransport().toString().compareTo(vouchers.get(j+1).getTransport().toString()) > 0){
                    swap(vouchers, j, j+1);
                }
            }
        }
        return vouchers;
    }

    public List<TravelVoucher> sortVouchersByTravelType(List<TravelVoucher> vouchers){
        for (int i = 0; i < vouchers.size() - 1; i++) {
            for (int j = 0; j < vouchers.size() - i - 1; j++) {
                if(vouchers.get(j).getTravelType().toString().compareTo(vouchers.get(j+1).getTravelType().toString()) > 0){
                    swap(vouchers, j, j+1);
                }
            }
        }
        return vouchers;
    }

    public List<TravelVoucher> sortVouchersByDays(List<TravelVoucher> vouchers){
        for (int i = 0; i < vouchers.size() - 1; i++) {
            for (int j = 0; j < vouchers.size() - i - 1; j++) {
                if(vouchers.get(j).getDays() > (vouchers.get(j+1).getDays())){
                    swap(vouchers, j, j+1);
                }
            }
        }
        return vouchers;
    }

    public void printVouchers(List<TravelVoucher> vouchers){
        if(!vouchers.isEmpty()){
            System.out.printf("\n%-10s%-6s%-12s%-11s%-13s\n", "Where", "Days", "Food incl.", "Transport", "Travel type");
            System.out.println("----------------------------------------------------");
            for (TravelVoucher tv: vouchers) {
                System.out.printf("%-10s%-6d%-12s%-11s%-13s\n", tv.getWhere(), tv.getDays(), tv.isFoodIncluded(), tv.getTransport(), tv.getTravelType());
            }
        } else {
            System.out.println("\nSuitable travel vouchers haven't been found.");
        }
    }

    private void swap(List<TravelVoucher> list, int i, int j){
        TravelVoucher tmp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, tmp);
    }



}
