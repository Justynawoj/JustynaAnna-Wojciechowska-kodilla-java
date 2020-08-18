package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //Given

        User user1 = new ZGeneration("Kelly");
        User user2 = new YGeneration("Mike");
        User user3 = new Millenials("Sue");

        //When
        String user1UsesSocial = user1.socialPublisher.showSocial();
        String user2UsesSocial = user2.socialPublisher.showSocial();
        String user3UsesSocial = user3.socialPublisher.showSocial();

        //Then
        Assert.assertEquals("Twitter",user1UsesSocial);
        Assert.assertEquals("Snapchat",user2UsesSocial);
        Assert.assertEquals("Facebook",user3UsesSocial);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User user1 = new ZGeneration("Kelly");
        String user1UsesSocial = user1.socialPublisher.showSocial();

        //When
        user1.setSocialPublisher(new FacebookPublisher());
        String newUser1Social = user1.socialPublisher.showSocial();

        //Then
        Assert.assertEquals("Facebook",newUser1Social);

    }
}
