package com.kodilla.good.patterns.challenges;

import java.util.HashMap;

interface OrderService {
        default boolean makeOrder(User user, HashMap<Product, Integer> mapOfProducts){

            /**
             * checking stock
             */

            return true;
       }
}
