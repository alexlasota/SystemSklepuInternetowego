package com.shop.manager;

import com.shop.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    private List<Product> products;

    public ProductManager() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    /**
     *
     * @param id
     * @return
     */

    //easada
    public Product getProductById(long id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public void updateProduct(Product updatedProduct) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == updatedProduct.getId()) {
                products.set(i, updatedProduct);
                break;
            }
        }
    }
}
