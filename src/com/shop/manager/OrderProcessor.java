package com.shop.manager;

import com.shop.model.Order;
import com.shop.model.Product;

import java.util.List;

public class OrderProcessor implements OrderManager {

    /**
     * Processes the given order by displaying order details and generating an invoice.
     *
     * @param order The order to be processed.
     */
    @Override
    public void processOrder(Order order) {
        displayOrderDetails(order);
        ProductDiscount.applyDiscountIfApplicable(order); // discount applied if applicable
        generateInvoice(order);
    }

    /**
     * Displays the details of the given order.
     *
     * @param order The order whose details are to be displayed.
     */
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

    /**
     * Generates an invoice for the given order.
     *
     * @param order The order for which the invoice is to be generated.
     */
    @Override
    public void generateInvoice(Order order) {
        System.out.println("Invoice generated.");
        System.out.println("Order details:");
        displayOrderDetails(order);
        System.out.println("Total price: " + order.getTotalPrice());
    }
}

