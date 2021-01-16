package com.kodilla.good.patterns.challenges.food2door;

public class Processor {
    public void processOrder(Shop shop, Item item) {

        Order newOrder = shop.process(item);
        if (newOrder.isOrderSuccessful()) {
            System.out.println("Your order has been successful, total price to pay is " + newOrder.getTotalPrice());
        } else {
            System.out.println("Your order has not been taken, please try again.");
        }
    }
}
