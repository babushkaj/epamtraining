package com.kotenkov.programming_with_class.the_simplest_class_and_object.task_9;

//  Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//  метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
//  методами. Задать критерии выбора данных и вывести эти данные на консоль.
//         Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//         Найти и вывести:
//         a) список книг заданного автора;
//         b) список книг, выпущенных заданным издательством;
//         c) список книг, выпущенных после заданного года.

import com.kotenkov.programming_with_class.the_simplest_class_and_object.task_9.additional_class.Author;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private int booksCounter;
    private Book [] books;

    public Library(int size){
        if(size > 0){
            books = new Book[size];
        } else {
            books = new Book[5];
        }
    }

    public Library(int size, Book[] books) {
        this(size);
        booksCounter = 0;

        for (int i = 0; i < books.length; i++) {
            if(books[i] != null && booksCounter < this.books.length){
                booksCounter++;
                this.books[booksCounter-1] = books[i];
            } else {
                System.out.println("Добавлены только " + this.books.length + " книги.");
                break;
            }
        }
    }


    public void addBook(Book b){
        if(booksCounter < this.books.length && b != null){
            booksCounter++;
            this.books[booksCounter-1] = b;
        } else {
            System.out.println("Книга не была добавлена.");
        }
    }

    public void deleteLastBook(){
        if(booksCounter > 0){
            this.books[booksCounter-1] = null;
            booksCounter--;
        } else {
            System.out.println("Книга не была удалёна.");
        }
    }

    public void printBooks(){
        for (Book b: books) {
            System.out.println(b);
        }
    }

    public List<Book> getBooksByAuthor(Author author){
        List<Book> list = new ArrayList<>();

        if(author != null){
            for (int i = 0; i < books.length; i++) {
                boolean condition = books[i].getAuthor().getFirstname().equalsIgnoreCase(author.getFirstname()) &&
                                    books[i].getAuthor().getSurname().equalsIgnoreCase(author.getSurname());
                if(condition){
                    list.add(books[i]);
                }
            }
        }

        return list;
    }

    public List<Book> getBooksByPublishingHouse(String ph){
        List<Book> list = new ArrayList<>();

        if(ph != null){
            for (int i = 0; i < books.length; i++) {
                if(books[i].getPublishingHouse().equalsIgnoreCase(ph)){
                    list.add(books[i]);
                }
            }
        }

        return list;
    }

    public List<Book> getBooksAfterYearOfPublishing(int year){
        List<Book> list = new ArrayList<>();

        if(year > 0){
            for (int i = 0; i < books.length; i++) {
                if(books[i].getYearOfPublishing() > year){
                    list.add(books[i]);
                }
            }
        }

        return list;
    }
}
