package com.kodilla.patterns2.observer.homework;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testUpdate(){
        //Given
        Student student1 = new Student("Mike");
        Student student2 = new Student("Jess");

        Homework homework1 = new Homework(20,"some descr");
        Homework homework2 = new Homework(22,"some descr 22");

        Mentor mentor1 = new Mentor("John");
        Mentor mentor2 = new Mentor("Rossie");
        Mentor mentor3 = new Mentor("Sue");

        //When
        student1.registerObserver(mentor1);
        student1.registerObserver(mentor2);
        student2.registerObserver(mentor2);

        student1.addNewHomeworkToList(homework1);
        student2.addNewHomeworkToList(homework1);
        student2.addNewHomeworkToList(homework2);

        //Then
        assertEquals(1,mentor1.getCount());
        assertEquals(3,mentor2.getCount());
        assertEquals(0,mentor3.getCount());
    }
}
