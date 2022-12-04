package com.example.mycommerce.user;

import com.example.mycommerce.cart.Cart;
import com.example.mycommerce.items.Item;

public class User extends Person{
    private Cart cart;

    public User(String id, String firstName, String lastName){
        super(id, firstName, lastName);
        this.cart = new Cart();
    }

    public void addToCart(Item item){
        cart.addItemToCart(item);
    }

    public void removeFromCart(String productId){
        cart.removeItemFromCart(productId);
    }

    public double getTotal(){
        return cart.getTotal();
    }
}
