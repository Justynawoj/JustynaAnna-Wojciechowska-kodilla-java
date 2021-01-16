package com.kodilla.good.patterns.challenges.food2door;

public class Item {
    private Product product;
    private double quantity;

    public Item(Product product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

}
