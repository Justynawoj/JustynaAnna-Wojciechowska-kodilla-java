package com.kodilla.patterns.factory.task;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    //Given
    TaskFactory factory = new TaskFactory();

    @Test
    public void testFactoryShopping(){

        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("grocery shopping", shopping.getTaskName());
        Assert.assertFalse(shopping.isTaskExecuted());
        shopping.executeTask();
        Assert.assertTrue(shopping.isTaskExecuted());

    }

    @Test
    public void testFactoryPainting(){

        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("painting door", painting.getTaskName());
        Assert.assertFalse(painting.isTaskExecuted());

    }

    @Test
    public void testFactoryDriving(){

        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("take kids to school", driving.getTaskName());
        Assert.assertFalse(driving.isTaskExecuted());
    }
}
