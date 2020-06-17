package com.kodilla.testing.forum.statistics;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StatisticCounterTest {

    @Test
    public void calculateAdvStatisticsTest() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCounter statisticCounter = new StatisticCounter();

        ArrayList<String> usersNames = new ArrayList<>();
        for(int i=0; i<100;i++){
            usersNames.add("user");
        }

        //when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());  //gdy liczba użytkowników = 0,
        //when(statisticsMock.commentsCount()).thenReturn(0);                 //gdy liczba komentarzy = 0,
        //when(statisticsMock.postsCount()).thenReturn(0);                    //gdy liczba postow = 0;

        when(statisticsMock.usersNames()).thenReturn(usersNames);           // gdy liczba użytkowników = 100
        when(statisticsMock.commentsCount()).thenReturn(1000);                 //gdy liczba komentarzy = 0,
        when(statisticsMock.postsCount()).thenReturn(0);                 //gdy liczba postow = 1000;


        //When
        statisticCounter.calculateAdvStatistics(statisticsMock);
        int userNamesNumber = statisticCounter.getUsersNumber();
        double posts = statisticCounter.getTotalPosts();
        double comments = statisticCounter.getTotalComments();
        double avPostPerUser = statisticCounter.getPostPerUser();
        double avCommentsPerPost = statisticCounter.getCommentsPerPost();
        double avCommentsPerUser = statisticCounter.getCommentsPerUser();



        //Then
        Assert.assertEquals(100,userNamesNumber);
        Assert.assertEquals(0,posts,0);
        Assert.assertEquals(1000,comments, 0);
        Assert.assertEquals(0,avPostPerUser,0);
        Assert.assertEquals(0,avCommentsPerPost,0);
        Assert.assertEquals(10,avCommentsPerUser,1);

    }

    //Given
    //When
    //Then
}
