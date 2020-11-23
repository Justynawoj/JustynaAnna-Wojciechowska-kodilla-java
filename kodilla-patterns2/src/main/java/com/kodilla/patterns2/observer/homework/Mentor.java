package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    String name;
    int count;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(Homework homework) {
        System.out.println(name + " you have new homework to check: Homework no. " +
                homework.getNumber() + " - "+ homework.getDescription());
        count++;
    }
}

