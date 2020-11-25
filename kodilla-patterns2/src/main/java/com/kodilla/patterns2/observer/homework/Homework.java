package com.kodilla.patterns2.observer.homework;

public class Homework {
    int number;
    String description;

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public Homework(int number, String description) {
        this.description = description;
        this.number = number;
    }
}
