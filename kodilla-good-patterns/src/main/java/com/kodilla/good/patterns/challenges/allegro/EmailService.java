package com.kodilla.good.patterns.challenges.allegro;

public class EmailService implements InformationService{

    String message;

    @Override
    public void inform(User user) {
        message = "Dear customer, your order has been successful";

        /**
         *  sending emails mechanism
         */

        System.out.println(message);
    }
}
