package com.shop.model;
import java.util.List;

public class Order {

    private List<Product> products;
    private Customer customer;
    private double totalPrice;

    public Order(List<Product> products, Customer customer, double totalPrice) {
        this.products = products;
        this.customer = customer;
        this.totalPrice = totalPrice;
    }


    public List<Product> getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}

