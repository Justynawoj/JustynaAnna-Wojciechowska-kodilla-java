package com.kodilla.good.patterns.challenges.allegro;


import java.time.LocalDateTime;
import java.util.HashMap;

public class OrderRequest {

    User user;
    LocalDateTime orderDate;
    HashMap<Product, Integer> productsOrderedAndQuantity;
    private int orderNumber = 1;
    private static int nextOrderNumber = 1;

    public OrderRequest(User user, LocalDateTime orderDate,
                        HashMap<Product, Integer> productsOrderedAndQuantity) {
        this.user = user;
        this.productsOrderedAndQuantity = productsOrderedAndQuantity;
        orderNumber = nextOrderNumber++;
    }

    public User getUser() {
        return user;
    }
    public LocalDateTime getOrderDate() {
        return orderDate;
    }
    public HashMap<Product, Integer> getProductsOrderedAndQuantity() {
        return productsOrderedAndQuantity;
    }
    public int getOrderNumber() {
        return orderNumber;
    }
}
