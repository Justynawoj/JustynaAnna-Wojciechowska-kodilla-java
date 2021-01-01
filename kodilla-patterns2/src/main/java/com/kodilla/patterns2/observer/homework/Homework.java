package com.kodilla.patterns2.observer.homework;

public class Homework {
    private int number;
    private String description;

    public Homework(int number, String description) {
        this.description = description;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }


}
