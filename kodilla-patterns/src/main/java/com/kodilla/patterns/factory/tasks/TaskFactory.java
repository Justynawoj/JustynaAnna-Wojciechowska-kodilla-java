package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String task) {
        switch (task) {
            case SHOPPING:
                return new ShoppingTask("grocery shopping", "bread", 2);
            case PAINTING:
                return new PaintingTask("painting door", "white", "front door");
            case DRIVING:
                return new DrivingTask("take kids to school", "school", "car");
            default:
                return null;
        }
    }
}
