package com.kodilla.good.patterns.challenges.allegro.services;

import com.kodilla.good.patterns.challenges.allegro.models.User;

public class EmailService implements InformationService{

    private static String MESSAGE = "Dear customer, your order has been successful";

    @Override
    public void inform(User user) {

        /**
         *  sending emails mechanism
         */
        System.out.println(MESSAGE);
    }
}
