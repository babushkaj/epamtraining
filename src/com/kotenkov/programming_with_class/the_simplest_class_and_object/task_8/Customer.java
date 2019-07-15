package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_8;

//  Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы,
//  set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Customer,
//  с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//  Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//         Найти и вывести:
//         a) список покупателей в алфавитном порядке;
//         b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

import com.kotenkov.programming_with_class.the_simplest_class_and_object.task_8.additional_class.Address;

public class Customer {

    private int id;
    private String surname;
    private String firstname;
    private String patronymic;
    private Address address;
    private String cardNumber;
    private String accountNumber;

    public Customer() {
    }

    public Customer(int id, String surname, String firstname) {
        this.id = id;
        this.surname = surname;
        this.firstname = firstname;
    }

    public Customer(int id, String surname, String firstname, String patronymic,
                    Address address, String cardNumber, String accountNumber) {
        this(id, surname, firstname);
        this.patronymic = patronymic;
        this.address = address;
        if(cardNumber.matches("[\\d]{16}")){
            this.cardNumber = cardNumber;
        }
        if(accountNumber.matches("[\\d]{18,34}")){
            this.accountNumber = accountNumber;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return  id + " " + surname + " " + firstname + " " + patronymic + "; " +
                address + "; cardNumber = " + cardNumber + "; accountNumber = " + accountNumber;
    }
}
