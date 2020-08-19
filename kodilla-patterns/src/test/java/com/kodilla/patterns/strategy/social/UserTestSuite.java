package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //Given

        User user = new ZGeneration("Kelly");
        User user2 = new YGeneration("Mike");
        User user3 = new Millenials("Sue");

        //When
        String user1UsesSocial = user.socialPublisher.showSocial();
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
        User user = new ZGeneration("Kelly");
        String userUsesSocial = user.socialPublisher.showSocial();

        //When
        user.setSocialPublisher(new FacebookPublisher());
        String newUserSocial = user.socialPublisher.showSocial();

        //Then
        Assert.assertEquals("Facebook",newUserSocial);

    }
}
