package com.kodilla.good.patterns.challenges.food2door;

public class Application {
    public static void main(String[] args) {
        Product product1 = new Product("Cat food", 20.33);
        Product product2 = new Product("Wine", 3.99);
        Product product3 = new Product("Diapers", 9.99);

        Item item1 = new Item(product1, 8);
        Item item2 = new Item(product2, 5);
        Item item3 = new Item(product3, 2);

        Producer extraFoodShop = new Producer("ExtraFoodProducer", ProducerType.EXTRA);
        Producer healthyShop = new Producer("Healthy Shop", ProducerType.HEALHTY);
        Producer glutenFreeShop = new Producer("Gluten Free Shop", ProducerType.STANDARD);

        Processor processor = new Processor();
        processor.processOrder(extraFoodShop, item1);
        processor.processOrder(healthyShop, item2);
        processor.processOrder(glutenFreeShop, item3);

    }

}
