package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Homework implements Observable{
    int number;
    String description;
    List<Observer> observers;
    List<Student> students;

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public Homework(int numer, String description) {
        this.observers = new ArrayList<>();
        this.students = new ArrayList<>();
        this.description = description;
        this.number = numer;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(this);
        }
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void addStudent(Student student){
        students.add(student);
        notifyObservers();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    private List<Student> getStudents() {
        return students;
    }

}
