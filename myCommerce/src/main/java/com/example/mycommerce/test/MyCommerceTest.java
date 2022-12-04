package com.example.mycommerce.test;

import com.example.mycommerce.services.Facade;

public class MyCommerceTest {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.registerUser("1", "Luiz", "");
        facade.registerUser("2", "Mimi", "");
        facade.registerUser("3", "Rodrigo", "");
        facade.registerUser("4", "Mama", "");


        facade.registerProduct("1", 10, "bola", 10);
        facade.registerProduct("2", 4, "alexa", 500);
        facade.registerProduct("3", 6, "kindle", 300);
        facade.registerProduct("4", 25, "chocolate", 4);

        facade.addToCart("1", "2", 1);
        facade.addToCart("1", "1", 1);
        facade.addToCart("1", "4", 5);

        facade.getCartPrice("1");

        facade.removeFromCart("1", "2");
        facade.getCartPrice("1");

    }
}
