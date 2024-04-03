package com.shop.model;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void clearCart() {
        products.clear();
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }


    public Order checkout(Customer customer) {
        List<Product> productsCopy = new ArrayList<>(products);

        ZonedDateTime orderTime = ZonedDateTime.now();
        Order order = new Order(productsCopy, customer, getTotalPrice(), orderTime);

        clearCart();
        return order;
    }
}