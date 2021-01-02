package com.kodilla.testing.loop;

import org.junit.Assert;
import org.junit.Test;

public class TestLoopAndConditionBreakponts {

    @Test
    public void testLoop(){
        //Given
        long sum = 0;
        int i;
        //When
        for( i = 0; i<1000; i++){
            sum += i;
            System.out.println("["+i+"] Sum equals: "+ sum);
        }

        //Then
        Assert.assertEquals(499500, sum);

    }
}
