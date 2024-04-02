package com.shop.model;
import java.time.ZonedDateTime;
import java.util.List;

public class Order {

    private List<Product> products;
    private Customer customer;
    private double totalPrice;
    private ZonedDateTime orderDateTime;


    public Order(List<Product> products, Customer customer, double totalPrice, ZonedDateTime orderTime) {
        this.products = products;
        this.customer = customer;
        this.totalPrice = totalPrice;
        this.orderDateTime = ZonedDateTime.now();
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

    public ZonedDateTime getOrderDateTime() {
        return orderDateTime;
    }
}

