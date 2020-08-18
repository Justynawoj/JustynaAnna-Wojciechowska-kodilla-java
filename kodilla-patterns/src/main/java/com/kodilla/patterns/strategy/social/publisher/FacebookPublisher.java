package com.kodilla.patterns.strategy.social.publisher;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String showSocial() {
        System.out.println("Facebook");
        return "Facebook";
    }
}
