package com.kotenkov.programming_with_class.aggregation_and_composition.task_5.travel;

//  Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
//  различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
//  Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

public class TravelVoucher {

    private String where;
    private int days;
    private boolean foodIncluded;
    TypeOfTransport transport;
    TravelType travelType;

    TravelVoucher(String where, int days, boolean foodIncluded, TypeOfTransport transport, TravelType travelType) {
        this.where = where;
        this.days = days;
        this.foodIncluded = foodIncluded;
        this.transport = transport;
        this.travelType = travelType;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public boolean isFoodIncluded() {
        return foodIncluded;
    }

    public void setFoodIncluded(boolean foodIncluded) {
        this.foodIncluded = foodIncluded;
    }

    public TypeOfTransport getTransport() {
        return transport;
    }

    public void setTransport(TypeOfTransport transport) {
        this.transport = transport;
    }

    public TravelType getTravelType() {
        return travelType;
    }

    public void setTravelType(TravelType travelTypes) {
        this.travelType = travelTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TravelVoucher that = (TravelVoucher) o;

        if (days != that.days) return false;
        if (foodIncluded != that.foodIncluded) return false;
        if (!where.equals(that.where)) return false;
        if (transport != that.transport) return false;
        return travelType == that.travelType;
    }

    @Override
    public int hashCode() {
        int result = where.hashCode();
        result = 31 * result + days;
        result = 31 * result + (foodIncluded ? 1 : 0);
        result = 31 * result + transport.hashCode();
        result = 31 * result + travelType.hashCode();
        return result;
    }
}
