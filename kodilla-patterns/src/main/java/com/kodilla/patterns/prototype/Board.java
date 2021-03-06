package com.kodilla.patterns.prototype;

import java.util.HashSet;
import java.util.Set;

public final class Board extends Prototype {
    private String name;
    private Set<TasksList> lists = new HashSet<>();

    public Board(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<TasksList> getLists() {
        return lists;
    }

    public Board shallowCopy() throws CloneNotSupportedException{
        return (Board)super.clone();
    }

    public Board deepCopy() throws CloneNotSupportedException {
        Board clonedBoard = (Board)super.clone();
        clonedBoard.lists = new HashSet<>();

        for(TasksList theOriginalList : lists) {

            TasksList clonedList = new TasksList(theOriginalList.getName());
            for(Task task : theOriginalList.getTasks()) {
                clonedList.getTasks().add(task);
            }
            clonedBoard.getLists().add(clonedList);
        }
        return clonedBoard;
    }

    @Override
    public String toString() {
        String s = "Board [" + name + "]\n";
        for(TasksList list : lists) {
            s = s + list.toString() + "\n";
        }
        return s;
    }

}