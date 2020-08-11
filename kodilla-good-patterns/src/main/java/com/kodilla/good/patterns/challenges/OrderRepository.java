package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRepository {

    Map<Integer, OrderRequest> ordersHistory = new HashMap<>();

    public void saveOrderInHistory(OrderRequest orderRequest){
        int orderNumber = orderRequest.getOrderNumber();
        ordersHistory.put(orderNumber,orderRequest);
    }

}
