package com.kodilla.good.patterns.challenges.allegro.orders;


import com.kodilla.good.patterns.challenges.allegro.models.Product;
import com.kodilla.good.patterns.challenges.allegro.models.User;

import java.time.LocalDateTime;
import java.util.Map;

public class OrderRequest {

    private static int nextOrderNumber = 1;
    private final User user;
    private final LocalDateTime orderDate;
    private final Map<Product, Integer> productsOrderedAndQuantity;
    private int orderNumber;

    public OrderRequest(User user,
                        LocalDateTime orderDate,
                        Map<Product, Integer> productsOrderedAndQuantity) {
        this.user = user;
        this.orderDate = orderDate;
        this.productsOrderedAndQuantity = productsOrderedAndQuantity;
        this.orderNumber = nextOrderNumber++;
    }

    public User getUser() {
        return user;
    }
    public LocalDateTime getOrderDate() {
        return orderDate;
    }
    public Map<Product, Integer> getProductsOrderedAndQuantity() {
        return productsOrderedAndQuantity;
    }
    public int getOrderNumber() {
        return orderNumber;
    }

}
