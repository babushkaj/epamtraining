package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_8;

//  Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы,
//  set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Customer,
//  с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//  Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//         Найти и вывести:
//         a) список покупателей в алфавитном порядке;
//         b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

import com.kotenkov.programming_with_class.the_simplest_class_and_object.task_8.additional_class.Address;

import java.util.List;

public class MainTask8 {

    public static void main(String[] args) {

        Address a1 = new Address("Минск", "Ленина", 34, 23);
        Customer c1 = new Customer(1, "Иванов", "Иван", "Иванович", a1,
                         "1111111111111111", "12345678901234567890");

        Address a2 = new Address("Гомель", "Советская", 43, 32);
        Customer c2 = new Customer(2, "Петров", "Пётр");
        c2.setPatronymic("Петрович");
        c2.setAddress(a2);
        c2.setCardNumber("2222222222222222");
        c2.setAccountNumber("987654321987654321");

        Address a3 = new Address("Могилёв", "Пушкина", 12, 2);
        Customer c3 = new Customer();
        c3.setId(3);
        c3.setSurname("Николаев");
        c3.setFirstname("Николай");
        c3.setPatronymic("Николаевич");
        c3.setAddress(a3);
        c3.setCardNumber("3333333333333333");
        c3.setAccountNumber("11111222223333344444");

        Address a4 = new Address("Гродно", "Гоголя", 17, 21);
        Customer c4 = new Customer(4, "Васильева", "Василиса", "Васильевна", a4,
                "4444444444444444", "99999999998888888888");

        Address a5 = new Address("Брест", "Лермонтова", 34, 53);
        Customer c5 = new Customer(4, "Александрова", "Александра", "Александровна", a5,
                "5555555555555555", "77777777776666666666");

        Customer [] customers = {c1,c2,c3,c4,c5};

        int num = 4;
        System.out.println("\nСоздаем CustomerBase на " + num + " места...");
        CustomerBase cb = new CustomerBase(num, customers);

        System.out.println("\nПокупатели после инициализации CustomerBase:");
        cb.printCustomers();

        System.out.println("\nПытаемся добавить ещё одного покупателя в CustomerBase...");
        cb.addCustomer(c5);

        System.out.println("\nУдалим последнего покупателя из CustomerBase...");
        cb.deleteLastCustomer();

        System.out.println("\nДобавим нового покупателя в CustomerBase...");
        cb.addCustomer(c5);

        System.out.println("\nCustomerBase после внесённых изменений:");
        cb.printCustomers();

        System.out.println("\nОтсортируем покупателей по фамилии в алфавитном порядке:");
        cb.sortCustomersInAlphabetOrder();
        cb.printCustomers();

        System.out.println("\nИщем покупателей по номерам карт...");
        List<Customer> list = cb.getCustomersFromCardNumbersRange();
        if(!list.isEmpty()){
            for (Customer c: list) {
                System.out.println(c);
            }
        }else{
            System.out.println("Покупателей с номерами карт, входящих в заданный диапазон, не найдено.");
        }
    }

}
