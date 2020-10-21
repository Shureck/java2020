package ru.shureck.java2020.Lab9;

public class Circle extends Shape {

    public Circle(int x1, int y1, int radius) {
        super(x1, y1, radius, 0);
    }

    @Override
    public int[] getCords() {
        return new int[]{getX1(),getY1(),getX2()};
    }

    @Override
    public void setSize() {

    }

    @Override
    public String toString() {
        return "Circle";
    }
}
