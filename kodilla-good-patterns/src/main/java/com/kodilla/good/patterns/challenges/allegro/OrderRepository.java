package com.kodilla.good.patterns.challenges.allegro;

import java.util.HashMap;
import java.util.Map;

public interface OrderRepository {

    Map<Integer, OrderRequest> ordersHistory = new HashMap<>();

    default void saveOrderInHistory(OrderRequest orderRequest){
        int orderNumber = orderRequest.getOrderNumber();
        ordersHistory.put(orderNumber,orderRequest);
    }

}
