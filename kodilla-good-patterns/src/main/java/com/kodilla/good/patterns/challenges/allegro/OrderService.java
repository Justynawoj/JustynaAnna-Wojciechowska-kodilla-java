package com.kodilla.good.patterns.challenges.allegro;

import java.util.HashMap;

interface OrderService {
        default boolean makeOrder(User user, HashMap<Product, Integer> mapOfProducts){

            /**
             * checking stock
             */

            return true;
       }
}
