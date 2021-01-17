package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observable{
    private String name;
    private List<Homework> doneHomeworkList;
    private List<Observer> observers;

    public Student(String name) {
        this.name = name;
        this.doneHomeworkList = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addNewHomeworkToList(Homework homework){
        doneHomeworkList.add(homework);
        notifyObservers(homework.getNumber());
    }

    public String getName() {
        return name;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(int homeworkNumber) {
        for (Observer observer: observers) {
           observer.update(this, homeworkNumber);
        }
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }
}
