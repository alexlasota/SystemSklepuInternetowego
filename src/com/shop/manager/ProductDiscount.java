package com.shop.manager;

import com.shop.model.Order;
import com.shop.model.Product;

import java.util.List;

public class ProductDiscount {
    private static final double DISCOUNT_RATE = 0.1;

    public static void applyDiscountIfApplicable(Order order) {
        double orderTotalPrice = order.getTotalPrice();
        if (orderTotalPrice > 10000) {
            applyDiscount(order);
        }
    }

    private static void applyDiscount(Order order) {
        List<Product> products = order.getProducts();
        for (Product product : products) {
            double discountedPrice = product.getPrice() * (1 - DISCOUNT_RATE);
            product.setPrice(discountedPrice);
        }
        double newTotalPrice = order.getTotalPrice() * (1 - DISCOUNT_RATE);
        order.setTotalPrice(newTotalPrice);
        System.out.println("Discount of 10% applied to the order.");
    }
}