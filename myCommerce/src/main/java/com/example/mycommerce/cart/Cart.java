package com.example.mycommerce.cart;

import com.example.mycommerce.items.Item;
import com.example.mycommerce.services.ItemFactory;

import java.util.HashSet;
import java.util.Set;

public class Cart {
    private int quantity;
    private Set<Item> items;

    private ItemFactory itemFactory;

    public Cart(){
        this.quantity = 0;
        this.items = new HashSet<>();
        this.itemFactory = new ItemFactory();
    }

    public Item findItem(String productId){
        for(Item item : items){
            if(item.getProductId() == productId){
                return item;
            }
        }
        return null;
    }

    public void addItemToCart(Item item){
        if(item == null){
            return;
        }
        items.add(item);
        this.quantity++;
    }

    public void removeItemFromCart(String productId){
        if(findItem(productId) == null){
            return;
        }
        items.remove(findItem(productId));
        this.quantity--;
    }

    public void increaseItemQuantity(String productId, int quantity){
        if(findItem(productId) == null){
            return;
        }
        findItem(productId).increaseProduct(quantity);
    }

    public void decreaseItemQuantity(String productId, int quantity){
        Item item = findItem(productId);
        if(item == null){
            return;
        }

        item.decreaseProduct(quantity);

        if(item.getQuantity() == 0){
            items.remove(item);
        }
    }

    public double getTotal(){
        double total = 0;
        for(Item item : items){
            total += item.getSubtotal();
        }
        return total;
    }

    public int getQuantity(){
        return quantity;
    }

}
