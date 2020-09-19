package ru.shureck.java2020.Lab5;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return height*width;
    }

    @Override
    public double getPerimetr() {
        return 2*(height+width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color" + getColor() +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
