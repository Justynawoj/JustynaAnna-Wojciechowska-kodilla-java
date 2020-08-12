package com.kodilla.good.patterns.challenges.allegro;

class Main{
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new EmailService(),
                new ProductOrderService(),new OrderRepository());
        orderProcessor.process(orderRequest);
    }
}