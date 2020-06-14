package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    @Test
    public void addFigureTest() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(1,shapeCollector.figures.size());
    }
    @Test
    public void removeFigureTest(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2);
        shapeCollector.addFigure(circle);
        //When
        shapeCollector.removeFigure(circle);
        //Then
        Assert.assertEquals(0,shapeCollector.figures.size());
    }
    @Test
    public void getFigureTest(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2);
        shapeCollector.addFigure(circle);
        //When
        Shape retrieved = shapeCollector.figures.get(0);
        //Then
        Assert.assertEquals(circle,retrieved);
    }
    @Test
    public void showFigureTest(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2);
        //When

    }
}
