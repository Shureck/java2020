package ru.shureck.java2020.Lab5;

public class SquareTrue extends Shape{
    private double side;

    public SquareTrue() {
    }

    public SquareTrue(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public SquareTrue(double width, double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimetr() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square_true{" +
                "side=" + side +
                '}';
    }
}
