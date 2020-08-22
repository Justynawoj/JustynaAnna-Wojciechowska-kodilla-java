package com.kodilla.good.patterns.challenges.allegro;

import java.util.HashMap;

interface OrderService {
    boolean makeOrder(User user, HashMap<Product, Integer> mapOfProducts);
}
