package com.kodilla.testing.forum.statistics;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StatisticCounterTest {

    Statistics statisticsMock = mock(Statistics.class);
    StatisticCounter statisticCounter = new StatisticCounter();

    @Test
    public void calculateAdvStatisticsTestUsersQuantity0() {
        //Given
        ArrayList<String> noUsers = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(noUsers);

        //When
        statisticCounter.calculateAdvStatistics(statisticsMock);
        int userNamesNumber = statisticCounter.getUsersNumber();

        //Then
        Assert.assertEquals(0,userNamesNumber);
    }

    @Test
    public void calculateAdvStatisticsTestUsersQuantity100() {

        //Given
        ArrayList<String> usersNames100 = new ArrayList<>();
        for(int i=0; i<100;i++){
            usersNames100.add("user");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames100);

        //When
        statisticCounter.calculateAdvStatistics(statisticsMock);
        int userNamesNumber = statisticCounter.getUsersNumber();

        //Then
        Assert.assertEquals(100,userNamesNumber);
    }
    @Test
    public void calculateAdvStatisticsTestPostQuantity0() {

        //Given
        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        statisticCounter.calculateAdvStatistics(statisticsMock);
        double posts = statisticCounter.getTotalPosts();

        //Then
        Assert.assertEquals(0,posts,0);
    }
    @Test
    public void calculateAdvStatisticsTestPostQuantity1000() {

        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        statisticCounter.calculateAdvStatistics(statisticsMock);
        double posts = statisticCounter.getTotalPosts();

        //Then
        Assert.assertEquals(1000,posts,0);
    }
    @Test
    public void calculateAdvStatisticsTestCommentsQuantity0() {

        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        statisticCounter.calculateAdvStatistics(statisticsMock);
        double posts = statisticCounter.getTotalComments();

        //Then
        Assert.assertEquals(0,posts,0);
    }
    @Test
    public void calculateAdvStatisticsTestCommentsPerPost1() {

        //Given
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(100);

        //When
        statisticCounter.calculateAdvStatistics(statisticsMock);
        double posts = statisticCounter.getCommentsPerPost();

        //Then
        Assert.assertEquals(0.1,posts,0);
    }
    @Test
    public void calculateAdvStatisticsTestCommentsPerPost2() {

        //Given
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(1);

        //When
        statisticCounter.calculateAdvStatistics(statisticsMock);
        double posts = statisticCounter.getCommentsPerPost();

        //Then
        Assert.assertEquals(100,posts,0);
    }
}
