package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;
import java.util.HashMap;

public class DeliveryRequest {

    private DeliveryProvider deliveryProvider;
    private LocalDateTime orderDate;
    private Product product;
    private int quantity;

    private int deliveryNumber = 1;
    private static int nextDeliveryNumber = 1;

    public DeliveryRequest(DeliveryProvider deliveryProvider, LocalDateTime orderDate, Product product, int quantity) {
        this.deliveryProvider = deliveryProvider;
        this.orderDate = orderDate;
        this.product = product;
        this.quantity = quantity;
        this.deliveryNumber = deliveryNumber;
    }

    public Product getProduct() {
        return product;
    }

    public int getDeliveryNumber() {
        return deliveryNumber;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }


    public DeliveryProvider getDeliveryProvider() {
        return deliveryProvider;
    }
}
