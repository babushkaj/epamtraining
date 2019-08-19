package com.kotenkov.basics_of_oop.task_2;

//  Создать класс Payment с внутренним классом, с помощью объектов которого
//  можно сформировать покупку из нескольких товаров.

import java.util.ArrayList;
import java.util.List;

public class Payment {

    private List<Product> products;

    public Payment() {
        products = new ArrayList<>();
    }

    public void addProduct(String productName, int productPrice){
        if(productName != null && productPrice > 0){
            Product p = new Product(productName, productPrice);
            Product checkedP = alreadyExist(p);
            if(checkedP != null){
                checkedP.quantity++;
            } else {
                products.add(p);
            }
        } else {
            System.out.println("\nPlease, check the product's attributes!");
        }
    }

    public void setQuantityOfProduct(int productN, int quantity){
        if(productN > 0 && products.size() >= productN && quantity > 0){
            products.get(productN - 1).quantity = quantity;
        } else {
            System.out.println("\nThe product's number hasn't been set. Please, check the entered data!");
        }
    }

    public void deleteProduct(int productN){
        if(productN > 0 && products.size() >= productN){
            products.remove(productN - 1);
        } else {
            System.out.println("\nPlease, check the product's number! The product hasn't been deleted.");
        }
    }

    public int calculateTotalSum(){
        int sum = 0;
        for (Product p: products) {
            sum += p.price * p.quantity;
        }
        return sum;
    }

    public void showAllProducts(){
        if(!products.isEmpty()){
            System.out.printf("\n%-5s%-10s%-6s%4s\n", "No", "product", "price", "pcs");
            System.out.println("-------------------------");
            for (int i = 0; i < products.size(); i++) {
                Product p = products.get(i);
                System.out.printf("%-5d%-10s%-6d%4d\n", i+1, p.name, p.price, p.quantity);
            }
            System.out.println("\nTotal sum to payment: " + calculateTotalSum());
        } else {
            System.out.println("There are no products to payment.");
        }

    }

    private Product alreadyExist(Product product){
        if(product != null){
            if(products.contains(product)){
                for (Product p: products) {
                    if(p.equals(product)){
                        return p;
                    }
                }
            }
        } else {
            System.out.println("Product can't be \"null\"!");
        }
        return null;
    }


    public class Product{

        private String name;
        private int price;
        private int quantity;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
            this.quantity = 1;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Product product = (Product) o;

            if (price != product.price) return false;
            return name.equals(product.name);
        }

        @Override
        public int hashCode() {
            int result = name.hashCode();
            result = 31 * result + price;
            return result;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("name = ");
            sb.append(name);
            sb.append(", price = ");
            sb.append(price);
            sb.append(", quantity = ");
            sb.append(quantity);
            return sb.toString();
        }
    }
}
