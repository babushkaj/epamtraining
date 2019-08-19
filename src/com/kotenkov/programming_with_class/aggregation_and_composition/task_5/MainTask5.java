package com.kotenkov.programming_with_class.aggregation_and_composition.task_5;

//  Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
//  различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
//  Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

import com.kotenkov.programming_with_class.aggregation_and_composition.task_5.travel.TravelAgency;
import com.kotenkov.programming_with_class.aggregation_and_composition.task_5.travel.TravelType;
import com.kotenkov.programming_with_class.aggregation_and_composition.task_5.travel.TravelVoucher;
import com.kotenkov.programming_with_class.aggregation_and_composition.task_5.travel.TypeOfTransport;

import java.util.List;

public class MainTask5 {

    public static void main(String[] args) {

        TravelAgency ta = new TravelAgency();
        TravelVoucher tv1 = ta.createTravelVoucher("Kenya",6, true, TypeOfTransport.PLANE, TravelType.TOURS);
        TravelVoucher tv2 = ta.createTravelVoucher("Greece",7, false, TypeOfTransport.BUS, TravelType.TOURS);
        TravelVoucher tv3 = ta.createTravelVoucher("Turkey",10, true, TypeOfTransport.PLANE, TravelType.RELAXATION);
        TravelVoucher tv4 = ta.createTravelVoucher("Georgia",14, true, TypeOfTransport.PLANE, TravelType.TREATMENT);
        TravelVoucher tv5 = ta.createTravelVoucher("Russia",5, false, TypeOfTransport.BUS, TravelType.TOURS);
        TravelVoucher tv6 = ta.createTravelVoucher("France",6, false, TypeOfTransport.BUS, TravelType.TOURS);
        TravelVoucher tv7 = ta.createTravelVoucher("Norway",8, true, TypeOfTransport.SHIP, TravelType.CRUISE);
        TravelVoucher tv8 = ta.createTravelVoucher("Sweden",7, false, TypeOfTransport.SHIP, TravelType.CRUISE);
        TravelVoucher tv9 = ta.createTravelVoucher("Ukraine",3, false, TypeOfTransport.BUS, TravelType.SHOPPING);
        TravelVoucher tv10 = ta.createTravelVoucher("Lithuania",4, false, TypeOfTransport.BUS, TravelType.SHOPPING);
        TravelVoucher tv11 = ta.createTravelVoucher("Cuba",14, true, TypeOfTransport.PLANE, TravelType.RELAXATION);
        TravelVoucher tv12 = ta.createTravelVoucher("Spain",10, false, TypeOfTransport.PLANE, TravelType.RELAXATION);
        TravelVoucher tv13 = ta.createTravelVoucher("Italy",6, true, TypeOfTransport.BUS, TravelType.TOURS);
        TravelVoucher tv14 = ta.createTravelVoucher("Russia",3, false, TypeOfTransport.BUS, TravelType.SHOPPING);
        TravelVoucher tv15 = ta.createTravelVoucher("Poland",4, false, TypeOfTransport.BUS, TravelType.SHOPPING);
        TravelVoucher tv16 = ta.createTravelVoucher("China",11, true, TypeOfTransport.PLANE, TravelType.TOURS);
        TravelVoucher tv17 = ta.createTravelVoucher("Belarus",14, true, TypeOfTransport.BUS, TravelType.TREATMENT);
        TravelVoucher tv18 = ta.createTravelVoucher("Bulgaria",10, true, TypeOfTransport.PLANE, TravelType.RELAXATION);

        List<TravelVoucher> allVouchers = ta.getTravelVouchers();

        //vouchers with included food
        List<TravelVoucher> vouchersByFood = ta.getTravelVouchersByFoodIncluded(allVouchers,true);
        //sorting by transport and print
        ta.printVouchers(ta.sortVouchersByTransport(vouchersByFood));

        //vouchers with a period of 5 days to 10 days
        List<TravelVoucher> vouchersByDays = ta.getTravelVouchersByDays(allVouchers, 5, 12);
        //sorting by days and print
        ta.printVouchers(ta.sortVouchersByDays(vouchersByDays));

        //vouchers with a period of 5 days to 10 days and transport is a plane
        List<TravelVoucher> vouchersByDaysAndTransport = ta.getTravelVouchersByTypeOfTransport( vouchersByDays,
                                                                                                TypeOfTransport.PLANE);
        //sorting by travel type and print
        ta.printVouchers(ta.sortVouchersByTravelType(vouchersByDaysAndTransport));

    }

}
