package ru.shureck.java2020.Lab6;

import ru.shureck.java2020.Lab5.Rectangle;
import ru.shureck.java2020.Lab5.Shape;

public class MovableRectangle extends Rectangle implements Movable{

    private double x;
    private double y;

    public MovableRectangle(String color, boolean filled, double width, double height, double x, double y) {
        super(color, filled, width, height);
        this.x = x;
        this.y = y;
    }

    public MovableRectangle(String color, boolean filled, double width, double height) {
        super(color, filled, width, height);
        this.x = width/2;
        this.y = height/2;
    }

    public MovableRectangle(double width, double height) {
        super(width, height);
        this.x = width/2;
        this.y = height/2;
    }

    @Override
    public void moveCenter(double right, double down) {
        this.x += right;
        this.y += down;
    }
}
