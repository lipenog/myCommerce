package com.example.mycommerce.items;

import com.example.mycommerce.products.Product;

public class Item {
    private Product product;
    private int quantity;
    private double subtotal;

    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String getProductId(){
        return product.getId();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubtotal(){
        return quantity * product.getPrice();
    }

    public void increaseProduct(int quantity){
        if(quantity <= 0){
            return;
        }
        this.quantity += quantity;
    }

    public void decreaseProduct(int quantity){
        if(quantity <= 0 || this.quantity - quantity < 0){
            return;
        }
        this.quantity -= quantity;
    }
}
