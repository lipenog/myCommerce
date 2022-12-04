package com.example.mycommerce.services;

import com.example.mycommerce.items.Item;

public class ItemFactory {
    private Item item;
    private ProductService productService;

    public ItemFactory(){
        productService = ProductService.getInstance();
    }

    public Item createItem(String productId, int quantity){
        if(productService.findById(productId) == null || quantity < 0){
            return null;
        }
        item = new Item(productService.findById(productId), quantity);
        return item;
    }
}
