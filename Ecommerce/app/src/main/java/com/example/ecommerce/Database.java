package com.example.ecommerce;

import java.util.ArrayList;
import java.util.List;

class Product {
    private int id;
    private String name;
    private String category;
    private double price;
    private String shipFrom;

    public Product(int id, String name, String category, double price, String shipFrom) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.shipFrom = shipFrom;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getShipFrom() {
        return shipFrom;
    }

    @Override
    public String toString() {
        return name + " | " + category + " | $" + price + " | Ships from: " + shipFrom;
    }
}

class ProductSeeder {

    public static List<Product> getSampleProducts() {
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "iPhone 14", "Electronics", 799.99, "USA"));
        products.add(new Product(2, "Samsung Galaxy S23", "Electronics", 699.99, "South Korea"));
        products.add(new Product(3, "Nike Running Shoes", "Footwear", 120.00, "Vietnam"));
        products.add(new Product(4, "Levi's Jeans", "Clothing", 59.99, "Bangladesh"));
        products.add(new Product(5, "Sony Headphones", "Electronics", 149.99, "Japan"));
        products.add(new Product(6, "Wooden Dining Table", "Furniture", 499.99, "USA"));
        products.add(new Product(7, "Instant Pot Cooker", "Home Appliances", 89.99, "China"));
        products.add(new Product(8, "Dell Laptop", "Electronics", 999.99, "USA"));
        products.add(new Product(9, "Adidas T-Shirt", "Clothing", 25.00, "Indonesia"));
        products.add(new Product(10, "Gaming Mouse", "Electronics", 49.99, "China"));

        return products;
    }

    public static void main(String[] args) {
        List<Product> products = getSampleProducts();

        // For now, just print them (replace this with DB insert logic)
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
