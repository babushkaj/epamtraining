package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_8;

//  Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы,
//  set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Customer,
//  с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//  Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//         Найти и вывести:
//         a) список покупателей в алфавитном порядке;
//         b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

import com.kotenkov.programming_with_class.the_simplest_class_and_object.task_8.additional_class.InputData;

import java.util.ArrayList;
import java.util.List;

public class CustomerBase {

    private int customersCounter;
    private Customer [] customers;

    public CustomerBase(int size){
        if(size > 0){
            customers = new Customer[size];
        } else {
            customers = new Customer[5];
        }
    }

    public CustomerBase(int size, Customer[] customers) {
        this(size);
        customersCounter = 0;

        for (int i = 0; i < customers.length; i++) {
            if(customers[i] != null && customersCounter < this.customers.length){
                customersCounter++;
                this.customers[customersCounter-1] = customers[i];
            } else {
                System.out.println("Добавлены только " + this.customers.length + " первых покупателей.");
                break;
            }
        }
    }

    public void addCustomer(Customer c){
        if(customersCounter < this.customers.length && c != null){
            customersCounter++;
            this.customers[customersCounter-1] = c;
        } else {
            System.out.println("Покупатель не был добавлен.");
        }
    }

    public void deleteLastCustomer(){
        if(customersCounter > 0){
            this.customers[customersCounter-1] = null;
            customersCounter--;
        } else {
            System.out.println("Покупатель не был удалён.");
        }
    }

    public void printCustomers(){
        for (Customer c: customers) {
            System.out.println(c);
        }
    }

    public void sortCustomersInAlphabetOrder(){
        for (int i = 0; i < customers.length - 1; i++) {
            for (int j = 0; j < customers.length - i - 1; j++) {
                if(customers[j].getSurname().compareTo(customers[j+1].getSurname()) > 0){
                    swap(customers, j, j+1);
                }
            }
        }
    }

    public List<Customer> getCustomersFromCardNumbersRange(){
        List<Customer> list = new ArrayList<>();
        InputData in = new InputData();
        String[] fromTo = in.getBordersOfCreditCardsNumbers();
        String from = fromTo[0];
        String to = fromTo[1];

        for (int i = 0; i < customers.length; i++) {
            String cardNumber = customers[i].getCardNumber();
            if(cardNumber != null){
                boolean condition = cardNumber.compareTo(from) >= 0 &&
                        cardNumber.compareTo(to) <= 0;
                if(condition){
                    list.add(customers[i]);
                }
            }

        }

        return list;
    }

    private static void swap(Customer [] c, int i, int j){
        Customer tmp = c[i];
        c[i] = c[j];
        c[j] = tmp;
    }

}
