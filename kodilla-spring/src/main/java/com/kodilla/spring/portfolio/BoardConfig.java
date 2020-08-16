package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    Board board;

    @Bean
    public Board board() {
        return new Board(getToDoList(),getInProgressList(),getDoneList());
    }
    @Autowired
    @Qualifier("getToDoList")
    TaskList taskList;

    @Bean
    @Scope("prototype")
    public  TaskList getToDoList() {
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList();
    }
}
