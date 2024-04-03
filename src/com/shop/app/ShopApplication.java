package com.shop.app;

import com.shop.manager.ProductProcessor;
import com.shop.model.Computer;
import com.shop.model.Product;
import com.shop.model.Smartphone;
import com.shop.ui.ConsoleUI;

import java.util.List;

public class ShopApplication {
    public static void main(String[] args) {
        ProductProcessor productManager = new ProductProcessor();


        Product product1 = new Product(1, "Laptop Dell", 2999, 10);
        Product product2 = new Smartphone(2, "iPhone 13", 4999, 5, List.of("Black", "White", "Gold"), "Black", 3000, true);
        Product product3 = new Computer(3, "Desktop PC", 3499, 15, "Intel Core i7", Computer.RamSize.RAM_8GB);

        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);


        ConsoleUI consoleUI = new ConsoleUI(productManager);
        consoleUI.start();
    }
}

