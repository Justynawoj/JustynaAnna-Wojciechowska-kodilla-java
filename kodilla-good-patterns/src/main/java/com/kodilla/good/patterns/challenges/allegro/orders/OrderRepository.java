package com.kodilla.good.patterns.challenges.allegro.orders;

import java.util.HashMap;
import java.util.Map;

public class OrderRepository {

    private final Map<Integer, OrderRequest> ordersHistory = new HashMap<>();

    public void saveOrderInHistory(OrderRequest orderRequest){
        int orderNumber = orderRequest.getOrderNumber();
        ordersHistory.put(orderNumber,orderRequest);
    }

}
