package com.kodilla.spring.forum;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public class ForumUserTestSuite {

    @Test
    public void testGetUsername() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser user = context.getBean(ForumUser.class);
        ForumUser user1 = (ForumUser) context.getBean("forumUser");

        //When
        String name = user.getUserName();

        //Then
        Assert.assertEquals("John Smith", name);
        Assert.assertEquals("John Smith", user1.getUserName());
    }
}
