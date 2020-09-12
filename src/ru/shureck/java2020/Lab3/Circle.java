package ru.shureck.java2020.Lab3;

public class Circle {
    private float radius;
    private String color;
    private boolean isEmpty;

    public Circle(float rad, String col, boolean emt){
        radius = rad;
        color = col;
        isEmpty = emt;
    }

    public float getP(){
        return (float) (2*Math.PI*radius);
    }

    public float getS(){
        return (float) Math.PI*radius*radius;
    }

    public float getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEmpty(boolean empty) {
        this.isEmpty = empty;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", isEmpty=" + isEmpty +
                ", P=" + getP() +
                ", S=" + getS() +
                '}';
    }
}
