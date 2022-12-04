package com.example.mycommerce.products;

import com.example.mycommerce.user.Photo;

public class Product {
    private String id;
    private int quantity;
    private String name;
    private Photo photo;
    private double price;
    private String description;

    public Product(String id, int quantity, String name, double price) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

    public Product(String id, int quantity, String name, Photo photo, double price, String description) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.photo = photo;
        this.price = price;
        this.description = description;
    }

    public void increaseQuantity(int quantity){
        if(quantity <= 0){
            return;
        }
        this.quantity += quantity;
    }

    public void decreaseQuantity(int quantity){
        if(quantity <= 0 || this.quantity - quantity < 0){
            return;
        }
        this.quantity -= quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID = " + id  +
                ", name = " + name  +
                ", quantity = " + quantity +
                '}';
    }
}
