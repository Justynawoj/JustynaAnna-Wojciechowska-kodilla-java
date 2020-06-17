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


        ArrayList<String> usersNames = new ArrayList<>();
        for(int i=0; i<100;i++){
            usersNames.add("user");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        StatisticCounter statisticCounter = new StatisticCounter();
        //When
        statisticCounter.calculateAdvStatistics(statisticsMock);
        int userNamesNumer = statisticCounter.getUsersNumber();
        Assert.assertEquals(100,userNamesNumer);
    }

/*
*
* gdy liczba postów = 0,
gdy liczba postów = 1000,
gdy liczba komentarzy = 0,
gdy liczba komentarzy < liczba postów,
gdy liczba komentarzy > liczba postów,
gdy liczba użytkowników = 0,
gdy liczba użytkowników = 100.
*

*     List<String> usersNames(); // list of users names
    int postsCount();          // total quantity of forum posts
    int commentsCount();       // total quantity of forum comments
 */

    //Given
    //When
    //Then
}
