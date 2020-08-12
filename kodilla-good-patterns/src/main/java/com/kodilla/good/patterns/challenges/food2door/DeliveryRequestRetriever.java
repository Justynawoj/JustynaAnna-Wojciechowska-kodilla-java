package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class DeliveryRequestRetriever {

    public DeliveryRequest retrieve(){

        DeliveryProvider deliveryProvider = new DeliveryProvider("HealtyFood",054625442455l,0215475451532l,"healtyhealty@com");
        LocalDateTime orderDate = LocalDateTime.of(2020,05,15,15,15,10);


        return new DeliveryRequest(deliveryProvider,orderDate,);
    }

}
