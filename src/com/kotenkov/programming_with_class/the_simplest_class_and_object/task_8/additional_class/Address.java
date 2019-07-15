package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_8.additional_class;

public class Address {

    private String city;
    private String street;
    private int homeNumber;
    private int flatNumber;

    public Address(String city, String street, int homeNumber, int flatNumber) {
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
        this.flatNumber = flatNumber;
    }

    @Override
    public String toString() {
        return city + ", " + street + " " + homeNumber + "/" + flatNumber;
    }
}
