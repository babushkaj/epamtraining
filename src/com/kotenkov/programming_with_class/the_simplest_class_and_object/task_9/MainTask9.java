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
import com.kotenkov.programming_with_class.the_simplest_class_and_object.task_9.additional_class.BookBinding;

import java.util.List;

public class MainTask9 {

    public static void main(String[] args) {

        Author author1 = new Author("Льюис", "Кэрролл");
        Book book1 = new Book(1, "Алиса в Стране Чудес", author1, "Детская литература",
                              1988, 144, 8, BookBinding.SOFTCOVER);

        Author author2 = new Author("Джоан", "Роулинг");
        Book book2 = new Book(2, "Гарри Поттер и Философский камень", author2, "Росмэн",
                2000, 400, 15, BookBinding.HARDCOVER);

        Author author3 = new Author("Стивен", "Кинг");
        Book book3 = new Book(3, "Оно", author3, "АСТ",
                2016, 1245, 13, BookBinding.HARDCOVER);

        Author author4 = new Author("Джеймс", "Чейз");
        Book book4 = new Book(4, "Перстень Борджиа", author4, "Иностранка",
                2018, 544, 12, BookBinding.HARDCOVER);

        Author author5 = new Author("Элис", "Сиболд");
        Book book5 = new Book(5, "Милые кости", author5, "Like book",
                2017, 384, 10, BookBinding.HARDCOVER);

        Book [] books = {book1, book2, book3, book4, book5};
        Library lib = new Library(5, books);

        System.out.println("Книги автора " + author1);
        List<Book> list = lib.getBooksByAuthor(author1);
        for (Book b:list) {
            System.out.println(b);
        }

        String publishingHouse = "Росмэн";
        System.out.println("\nКниги издательства " + publishingHouse);
        list = lib.getBooksByPublishingHouse(publishingHouse);
        for (Book b:list) {
            System.out.println(b);
        }

        int year = 2005;
        System.out.println("\nКниги, выпущенные после " + year + " года");
        list = lib.getBooksAfterYearOfPublishing(year);
        for (Book b:list) {
            System.out.println(b);
        }
    }

}
