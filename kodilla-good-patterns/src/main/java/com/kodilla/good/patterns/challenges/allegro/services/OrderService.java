package com.kodilla.good.patterns.challenges.allegro.services;

import com.kodilla.good.patterns.challenges.allegro.order.OrderRequest;

public interface OrderService {
    boolean makeOrder(OrderRequest orderRequest);
}
