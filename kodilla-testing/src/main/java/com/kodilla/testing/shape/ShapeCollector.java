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
        StringBuilder sb = new StringBuilder();

        for (Shape figure: figures){

            sb.append(figure.getShapeName());
            sb.append(" (");
            sb.append(figure.getField());
            sb.append("), ");
        }

        return sb.toString();
    }
}
