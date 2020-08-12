package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;
import java.util.HashMap;

public class DeliveryRequest {

    DeliveryProvider deliveryProvider;
    LocalDateTime orderDate;
    Product product;

    private int deliveryNumber = 1;
    private static int nextDeliveryNumber = 1;

    public DeliveryRequest(DeliveryProvider deliveryProvider, LocalDateTime orderDate, Product product, int deliveryNumber) {
        this.deliveryProvider = deliveryProvider;
        this.orderDate = orderDate;
        this.product = product;
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
