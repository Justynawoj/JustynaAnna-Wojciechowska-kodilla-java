package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{

    private String taskName;
    private String whatToBuy;
    private double quantity;

    private boolean isTaskExecuted = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        this.isTaskExecuted = true;
        return "Executing task - "+taskName + ". What to buy: "+ whatToBuy + ", quantity: "+ quantity;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }
}
