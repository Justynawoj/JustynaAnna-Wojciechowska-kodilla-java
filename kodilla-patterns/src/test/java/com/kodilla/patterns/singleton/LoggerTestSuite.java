package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
/*
Przed wzorcem singleton
    @Test
    public void getLastLogTest(){

        //Given
        Logger logger = new Logger();

        //When
        logger.log("4547df");

        //Then
        String lastLog = logger.getLastLog();

        Assert.assertEquals("4547df",lastLog);
    }
    */

    //////////////////////////////////
    //Po wprowadzeniu wzorca singleton
    @Test
    public void getLastLogTest() {

        //Given
        //When
        Logger.getInstance().log("5554fd");

        //Then
        String lastLog = Logger.getInstance().getLastLog();
        Assert.assertEquals("5554fd", lastLog);
    }
}
