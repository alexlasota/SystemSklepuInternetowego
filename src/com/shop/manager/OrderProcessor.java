package com.shop.manager;

import com.shop.model.Order;
import com.shop.model.Product;

import java.util.List;

public class OrderProcessor implements OrderManager {

    @Override
    public void processOrder(Order order) {
        displayOrderDetails(order);
        generateInvoice(order);
    }

    @Override
    public void displayOrderDetails(Order order) {
        System.out.println("Order for client: " + order.getCustomer().getFirstName() +
                " " + order.getCustomer().getLastName());
        System.out.println("Products ordered:");
        List<Product> products = order.getProducts();
        for (Product product : products) {
            System.out.println("- " + product.getProductName() + ": " + product.getPrice());
        }
        System.out.println("Total price: " + order.getTotalPrice());
    }

    @Override
    public void generateInvoice(Order order) {
        System.out.println("Invoice generated.");
        System.out.println("Order details:");
        displayOrderDetails(order);
        System.out.println("Total price: " + order.getTotalPrice());
    }
}

