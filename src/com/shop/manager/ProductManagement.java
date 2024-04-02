package com.shop.manager;

import com.shop.model.Product;

import java.util.List;

public interface ProductManagement {

    void addProduct(Product product);
    void removeProduct(Product product);
    List<Product> getProducts();
    Product getProductById(long id);
    void updateProduct(Product updatedProduct);
}
