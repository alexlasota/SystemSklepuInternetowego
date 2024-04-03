package com.shop.manager;

import com.shop.model.Order;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    private static final String FILE_PATH = "orders.txt";

    public void saveOrder(Order order) {
        try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
            writer.write(order.toString() + System.lineSeparator());
        } catch (IOException e) {
            System.err.println("Error while saving order to file: " + e.getMessage());
        }
    }

    public List<Order> loadOrders() {
        List<Order> orders = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                orders.add(deserializeOrder(line));
            }
        } catch (IOException e) {
            System.err.println("Error while reading order from file: " + e.getMessage());
        }
        return orders;
    }

    private Order deserializeOrder(String line) {
        return null;
    }
}

