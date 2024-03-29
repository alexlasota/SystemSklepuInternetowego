package com.shop.manager;

import com.shop.model.Order;

public interface OrderManager {
    void processOrder(Order order);
    void generateInvoice(Order order);
    void displayOrderDetails(Order order);
}
