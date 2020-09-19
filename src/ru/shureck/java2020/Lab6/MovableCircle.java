package ru.shureck.java2020.Lab6;

public class MovableCircle implements Movable{
    private double radius;
    private double x,y;

    public MovableCircle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void moveCenter(double right, double down) {
        this.x += right;
        this.y += down;
    }
}
