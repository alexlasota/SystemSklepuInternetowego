package com.shop.model;

import java.util.Objects;

public class Product {

    private long id;
    private String productName;
    private double price;
    private int amountOfProduct;

    public Product() {
    }

    public Product(long id, String productName, double price, int amountOfProduct) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.amountOfProduct = amountOfProduct;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmountOfProduct() {
        return amountOfProduct;
    }

    public void setAmountOfProduct(int amountOfProduct) {
        this.amountOfProduct = amountOfProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Double.compare(price, product.price) == 0 && amountOfProduct == product.amountOfProduct && Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, price, amountOfProduct);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", amountOfProduct=" + amountOfProduct +
                '}';
    }
}