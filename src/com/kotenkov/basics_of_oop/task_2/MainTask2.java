package com.kotenkov.basics_of_oop.task_2;

//  Создать класс Payment с внутренним классом, с помощью объектов которого
//  можно сформировать покупку из нескольких товаров.

public class MainTask2 {

    public static void main(String[] args) {

        Payment p = new Payment();

        p.addProduct("Sweets", 12);
        p.addProduct("Apple", 3);
        p.addProduct("Bananas", 5);

        p.showAllProducts();

        p.setQuantityOfProduct(2, 5);
        p.addProduct("Bananas", 5);
        p.deleteProduct(1);

        p.showAllProducts();
    }

}
