package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_9;

//  Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//  метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
//  методами. Задать критерии выбора данных и вывести эти данные на консоль.
//         Book: id, название, автор, издательство, год издания, количество страниц, цена, тип переплета.
//         Найти и вывести:
//         a) список книг заданного автора;
//         b) список книг, выпущенных заданным издательством;
//         c) список книг, выпущенных после заданного года.

import com.kotenkov.programming_with_class.the_simplest_class_and_object.task_9.additional_class.Author;
import com.kotenkov.programming_with_class.the_simplest_class_and_object.task_9.additional_class.BookBinding;

public class Book {

    private int id;
    private String title;
    private Author author;
    private String publishingHouse;
    private int yearOfPublishing;
    private int numberOfPages;
    private double price;
    private BookBinding bookBinding;

    public Book(int id, String title, Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Book(int id, String title, Author author, String publishingHouse,
                int yearOfPublishing, int numberOfPages, double price, BookBinding bookBinding) {
        this(id, title, author);
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bookBinding = bookBinding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id > 0){
            this.id = id;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        if(yearOfPublishing > 0){
            this.yearOfPublishing = yearOfPublishing;
        }
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if(numberOfPages > 0){
            this.numberOfPages = numberOfPages;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0){
            this.price = price;
        }
    }

    public BookBinding getBookBinding() {
        return bookBinding;
    }

    public void setBookBinding(BookBinding bookBinding) {
        this.bookBinding = bookBinding;
    }

    @Override
    public String toString() {
        return  id + " " + author.toString() + " \"" + title + "\", " + publishingHouse +
                ", " + yearOfPublishing + ", " + numberOfPages + "с., " + price +
                "$, " + bookBinding.getValue();
    }
}
