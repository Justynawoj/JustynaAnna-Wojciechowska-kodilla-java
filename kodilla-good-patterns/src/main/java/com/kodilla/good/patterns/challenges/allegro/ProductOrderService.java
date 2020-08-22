package com.kodilla.good.patterns.challenges.allegro;

import java.util.HashMap;

public class ProductOrderService implements OrderService {

    @Override
    public boolean makeOrder(User user, HashMap<Product, Integer> mapOfProducts) {
        /**
         * checking stock
         */
        return true;
    }
}

