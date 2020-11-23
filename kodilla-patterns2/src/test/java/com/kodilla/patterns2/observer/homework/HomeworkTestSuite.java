package com.kodilla.patterns2.observer.homework;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testUpdate(){
        //Given
        Student student1 = new Student("mike");
        Student student2 = new Student("jess");

        Homework homework1 = new Homework(20,"some descr");
        Homework homework2 = new Homework(22,"some descr 22");

        Mentor mentor1 = new Mentor("John");
        Mentor mentor2 = new Mentor("Rossie");

        homework1.getObservers().add(mentor1);
        homework1.getObservers().add(mentor2);
        homework2.getObservers().add(mentor2);

        //When
        homework1.addStudent(student1);
        homework2.addStudent(student2);
        homework1.addStudent(student2);

        //Then
        assertEquals(2,mentor1.count);
        assertEquals(3,mentor2.count);



    }
}
