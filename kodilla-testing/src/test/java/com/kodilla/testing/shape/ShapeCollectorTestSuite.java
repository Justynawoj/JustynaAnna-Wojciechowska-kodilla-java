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
        Shape retrieved = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(circle,retrieved);
    }
    @Test
    public void removeFigureTest(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2);
        shapeCollector.addFigure(circle);
        //When
        shapeCollector.removeFigure(circle);
        String retrieved = shapeCollector.showFigures();

        //Then
        Assert.assertEquals("",retrieved);
    }
    @Test
    public void getFigureTest(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(2);
        shapeCollector.addFigure(circle);
        //When
        Shape retrieved = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(circle,retrieved);

    }
    @Test
    public void showFiguresTest(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(2);
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(5,4);
        //When
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        String figuresRetrieved = shapeCollector.showFigures();
        //Then
        Assert.assertEquals("square (4.0), circle (12.566370614359172), triangle (10.0), ", figuresRetrieved);
    }
}
