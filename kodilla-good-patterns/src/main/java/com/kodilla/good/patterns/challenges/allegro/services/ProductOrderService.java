package com.kodilla.good.patterns.challenges.allegro.services;

import com.kodilla.good.patterns.challenges.allegro.models.Product;
import com.kodilla.good.patterns.challenges.allegro.models.User;
import com.kodilla.good.patterns.challenges.allegro.order.OrderRequest;

import java.util.HashMap;
import java.util.Map;

public class ProductOrderService implements OrderService {

    @Override
    public boolean makeOrder(OrderRequest orderRequest) {

        User user = orderRequest.getUser();
        Map<Product, Integer> mapOfProducts = orderRequest.getProductsOrderedAndQuantity();
        /**
         * checking stock
         */
        return true;
    }
}

