package com.kodilla.good.patterns.challenges.food2door;

public class Order {

    private boolean isOrderSuccessful;
    private double totalPrice;

    public void setOrderSuccessful(boolean orderSuccessful) {
        isOrderSuccessful = orderSuccessful;
    }

    public boolean isOrderSuccessful() {
        return isOrderSuccessful;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
