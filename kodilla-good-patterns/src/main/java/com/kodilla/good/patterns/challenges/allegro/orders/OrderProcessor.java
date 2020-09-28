package com.kodilla.good.patterns.challenges.allegro.orders;

import com.kodilla.good.patterns.challenges.allegro.services.InformationService;
import com.kodilla.good.patterns.challenges.allegro.services.OrderService;

public class OrderProcessor {

    private final InformationService informationService;
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                           final OrderService orderService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.makeOrder(orderRequest);

        if(isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.saveOrderInHistory(orderRequest);
            System.out.println("Order no "+ orderRequest.getOrderNumber() + " has been successful");
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            System.out.println("Order no "+ orderRequest.getOrderNumber() + "has NOT been successful");
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}