package com.kodilla.good.patterns.challenges.food2door;


public class Producer implements Shop {
    private String producerName;
    private ProducerType producerType;

    public Producer(String producerName, ProducerType producerType) {
        this.producerName = producerName;
        this.producerType = producerType;
    }

    @Override
    public Order process(Item item) {
        Order order = new Order();
        if (producerType.equals(ProducerType.EXTRA)) {
            order.setOrderSuccessful(true);
            order.setTotalPrice(item.getTotalPrice() + 10);
        } else if (producerType.equals(ProducerType.HEALHTY)) {
            order.setOrderSuccessful(true);
            order.setTotalPrice(item.getTotalPrice() + 20);
        } else {
            order.setTotalPrice(item.getTotalPrice());
            order.setOrderSuccessful(true);
        }
        return order;
    }
}

