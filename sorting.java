package cakk;

import java.util.*;

public class sorting {

    // Product Class
    static class Product {
        private int id;
        private String name;
        private double price;

        public Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Product [id=" + id +
                    ", name=" + name +
                    ", price=" + price + "]";
        }
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product(11, "pen", 10));
        products.add(new Product(12, "pencil", 8));
        products.add(new Product(13, "notebook", 120));
        products.add(new Product(7, "ink", 5));
        products.add(new Product(23, "pendrive", 1200));

        // Sort By ID
        System.out.println("===== SORT BY ID =====");
        Collections.sort(products,
                Comparator.comparingInt(Product::getId));
        products.forEach(System.out::println);

        // Sort By Name
        System.out.println("\n===== SORT BY NAME =====");
        Collections.sort(products,
                Comparator.comparing(Product::getName));
        products.forEach(System.out::println);

        // Sort By Price
        System.out.println("\n===== SORT BY PRICE =====");
        Collections.sort(products,
                Comparator.comparingDouble(Product::getPrice));
        products.forEach(System.out::println);

        // Sort By Name, then Price, then ID
        System.out.println("\n===== SORT BY NAME -> PRICE -> ID =====");
        Collections.sort(products,
                Comparator.comparing(Product::getName)
                          .thenComparing(Product::getPrice)
                          .thenComparing(Product::getId));

        products.forEach(System.out::println);
    }
}