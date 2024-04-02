package com.shop.manager;

import com.shop.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductProcessor implements ProductManagement {

    private List<Product> products;

    public ProductProcessor() {
        this.products = new ArrayList<>();
    }

    /**
     * Adds a new product to the processor.
     * @param product The product to be added.
     */
    public void addProduct(Product product) {
        products.add(product);
    }

    /**
     * Removes a product from the processor.
     * @param product The product to be removed.
     */
    public void removeProduct(Product product) {
        products.remove(product);
    }

    /**
     * Returns a list of all products in the processor.
     * @return A list containing all products.
     */
    public List<Product> getProducts() {
        return products;
    }


    /**
     * Finds a product with the given identifier.
     * @param id The identifier of the product to be found.
     * @return The product with the given identifier, or null if the product is not found.
     */
    public Product getProductById(long id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    /**
     * Updates an existing product in the processor.
     * @param updatedProduct The updated product to replace the existing product.
     */
    public void updateProduct(Product updatedProduct) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == updatedProduct.getId()) {
                products.set(i, updatedProduct);
                break;
            }
        }
    }
}
