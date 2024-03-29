package com.shop.ui;

import com.shop.manager.OrderProcessor;
import com.shop.manager.ProductManager;
import com.shop.model.Cart;
import com.shop.model.Customer;
import com.shop.model.Order;
import com.shop.model.Product;

import java.util.List;
import java.util.Scanner;

public class ConsoleUI {

    private ProductManager productManager;
    private Cart cart;
    private OrderProcessor orderProcessor;
    private Scanner scanner;

    public ConsoleUI(ProductManager productManager) {
        this.productManager = productManager;
        cart = new Cart();
        orderProcessor = new OrderProcessor();
        scanner = new Scanner(System.in);
    }

    public void start() {
        boolean exit = false;
        while (!exit) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewProducts();
                    break;
                case 2:
                    addProductToCart();
                    break;
                case 3:
                    checkoutCart();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void displayMenu() {
        System.out.println("Welcome to the Online Shop!");
        System.out.println("1. View Products");
        System.out.println("2. Add Product to Cart");
        System.out.println("3. Checkout Cart");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private void viewProducts() {
        List<Product> products = productManager.getProducts();
        System.out.println("Available Products:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private void addProductToCart() {
        System.out.print("Enter product ID: ");
        long productId = scanner.nextLong();
        scanner.nextLine();

        Product product = productManager.getProductById(productId);
        if (product != null) {
            cart.addProduct(product);
            System.out.println("Product added to cart.");
        } else {
            System.out.println("Product not found.");
        }
    }

    private void checkoutCart() {
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        Customer customer = new Customer(firstName, lastName);
        Order order = cart.checkout(customer);
        orderProcessor.processOrder(order);
//    }
//
//    public static void main(String[] args) {
//        ConsoleUI consoleUI = new ConsoleUI();
//        consoleUI.start();
    }
}

//Utworzenie interfejsu command line umożliwiającego przeglądanie produktów, dodawanie do koszyka, składanie zamówienia.