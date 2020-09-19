package ru.shureck.java2020.Lab5;

public class Square extends Rectangle{

    public Square() {
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square(double side) {
        super(side, side);
    }

    public double getSide(){
        return getHeight();
    }

    @Override
    public void setHeight(double height) {
        super.setWidth(height);
        super.setHeight(height);
    }

    @Override
    public void setWidth(double height) {
        super.setWidth(height);
        super.setHeight(height);
    }

    @Override
    public String toString() {
        return "Square{"+ super.toString() +"}";
    }
}
