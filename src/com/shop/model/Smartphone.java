package com.shop.model;

import java.util.List;

public class Smartphone extends Product {

    private List<String> availableColors;
    private String color;
    private int batteryCapacity;
    private boolean accessories;


    public Smartphone(long id, String productName, double price, int amountOfProduct, List<String> availableColors, String color, int batteryCapacity, boolean accessories) {
        super(id, productName, price, amountOfProduct);
        this.availableColors = availableColors;
        this.color = color;
        this.batteryCapacity = batteryCapacity;
        this.accessories = accessories;
    }

    public List<String> getAvailableColors() {
        return availableColors;
    }

    public void setAvailableColors(List<String> availableColors) {
        this.availableColors = availableColors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (availableColors.contains(color)) {
            this.color = color;
        } else {
            System.out.println("Chosen color is currently unavailable.");
            System.out.println("Please choose a color again.");
        }
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public boolean isAccessories() {
        return accessories;
    }

    public void setAccessories(boolean accessories) {
        this.accessories = accessories;
    }
}
//Typ Produktu: Smartfon**
//
//Specyficzna Obsługa: Dodanie funkcji umożliwiającej
// wybór koloru, pojemności baterii, oraz dodatkowych akcesoriów przy zakupie smartfona.