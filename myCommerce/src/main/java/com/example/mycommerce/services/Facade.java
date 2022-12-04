package com.example.mycommerce.services;

import com.example.mycommerce.items.Item;
import com.example.mycommerce.user.User;

public class Facade {
    private ProductService productService;
    private UserService userService;
    private ItemFactory itemFactory;

    public Facade(){
        productService = ProductService.getInstance();
        userService = UserService.getInstance();
        itemFactory = new ItemFactory();
    }

    public void registerUser(String id, String firstName, String lastName){
        userService.addUser(id, firstName, lastName);
    }

    public void registerProduct(String id, int quantity, String name, double price){
        productService.addProduct(id, quantity, name, price);
    }

    public void addToCart(String userId, String productId, int quantity){
        User user = (User) userService.findById(userId);
        Item item = itemFactory.createItem(productId, quantity);
        if(item != null){
            user.addToCart(item);
        }
    }

    public void removeFromCart(String userId, String productId){
        User user = (User) userService.findById(userId);
        user.removeFromCart(productId);
    }

    public void getCartPrice(String userId){
        User user = (User) userService.findById(userId);
        System.out.println(user.getTotal());
    }
}
