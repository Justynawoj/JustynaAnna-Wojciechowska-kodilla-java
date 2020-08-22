package com.kodilla.good.patterns.challenges.food2door;

public class EmailService implements InformationService{
    @Override
    public void inform(DeliveryProvider deliveryProvider) {
        System.out.println("Sending email to: "+ deliveryProvider);
    }
}
