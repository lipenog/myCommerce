package com.example.mycommerce.services;

import com.example.mycommerce.products.Product;

import java.util.HashSet;
import java.util.Set;

public class ProductService {
    private static ProductService singleton;
    private Set<Product> products;
    private ProductService(){
        products = new HashSet<>();
    }

    public static ProductService getInstance(){
        if(singleton == null){
            singleton = new ProductService();
        }
        return singleton;
    }
    public Product findById(String productId){
        for(Product product : products){
            if(product.getId() == productId){
                return product;
            }
        }
        return null;
    }
    public void addProduct(String productId, int quantity, String name, double price){
        if(findById(productId) != null){
            return;
        }
        products.add(new Product(productId, quantity, name, price));
    }

    public void removeProduct(String productId){
        if(findById(productId) == null){
            return;
        }
        products.remove(findById(productId));
    }

    public void increaseQuantity(String productId, int quantity){
        if(findById(productId) == null){
            return;
        }
        findById(productId).increaseQuantity(quantity);
    }

    public void decreaseQuantity(String productId, int quantity){
        if(findById(productId) == null){
            return;
        }
        findById(productId).decreaseQuantity(quantity);
    }

    public void logProducts(){
        for(Product product: products){
            System.out.println(product);
        }
    }
}
