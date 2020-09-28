package com.kodilla.good.patterns.challenges.allegro.services;

import com.kodilla.good.patterns.challenges.allegro.orders.OrderRequest;

public interface OrderService {
    boolean makeOrder(OrderRequest orderRequest);
}
