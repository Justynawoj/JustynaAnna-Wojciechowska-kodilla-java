package com.kodilla.good.patterns.challenges.food2door;

public class Product {
    private int productID;
    private double pricePerUnit;

    public Product(int productID, double pricePerUnit) {
        this.productID = productID;

        this.pricePerUnit = pricePerUnit;
    }

    public int getProductID() {
        return productID;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}
