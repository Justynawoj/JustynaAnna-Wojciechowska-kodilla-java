package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> figures;

    public ShapeCollector() {
        figures = new ArrayList<>();
    }

    public void addFigure(Shape shape){
        figures.add(shape);
    }
    public void removeFigure(Shape shape){
        figures.remove(shape);
    }
    public Shape getFigure(int index){
        return figures.get(index);
    }
    public String showFigures(){
        String allFigures = "";
        for (Shape figure: figures){
            allFigures += figure.getShapeName()+" ("+figure.getField()+"), ";
        }

        return allFigures;
    }
}
