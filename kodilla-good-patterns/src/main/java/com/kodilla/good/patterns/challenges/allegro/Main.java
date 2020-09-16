package com.kodilla.good.patterns.challenges.allegro;

import com.kodilla.good.patterns.challenges.allegro.order.OrderProcessor;
import com.kodilla.good.patterns.challenges.allegro.order.OrderRepository;
import com.kodilla.good.patterns.challenges.allegro.order.OrderRequest;
import com.kodilla.good.patterns.challenges.allegro.order.OrderRequestRetriever;
import com.kodilla.good.patterns.challenges.allegro.services.EmailService;
import com.kodilla.good.patterns.challenges.allegro.services.ProductOrderService;

public class Main{
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new EmailService(),
                new ProductOrderService(),
                new OrderRepository());

        orderProcessor.process(orderRequest);
    }
}