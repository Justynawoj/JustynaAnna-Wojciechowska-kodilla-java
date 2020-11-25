package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    String name;
    int count;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(Student student, int homeworkNumber) {
        System.out.println(name + " you have new homework to check added by your student " +
                student.getName() + ". Homework to check: "+ homeworkNumber);
        count++;
    }
}

