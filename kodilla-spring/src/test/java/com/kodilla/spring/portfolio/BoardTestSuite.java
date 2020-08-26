package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {


    @Test
    public void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().getTasks().add("learn hibernate");
        board.getInProgressList().getTasks().add("learn spring");
        board.getDoneList().getTasks().add("learn streams");

        String toDoTask = board.getToDoList().getTasks().get(0);
        String inProgressTask = board.getInProgressList().getTasks().get(0);
        String doneTask = board.getDoneList().getTasks().get(0);

        //Then
        Assert.assertEquals("learn hibernate",toDoTask );
        Assert.assertEquals("learn spring",inProgressTask);
        Assert.assertEquals("learn streams",doneTask);
    }
}
