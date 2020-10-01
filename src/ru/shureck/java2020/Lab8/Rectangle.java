package ru.shureck.java2020.Lab8;

public class Rectangle extends Shape{

    public Rectangle(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
        setSize();
    }

    @Override
    public int[] getCords() {
        return new int[]{getX1(),getY1(),getX2(),getY2()};
    }

    @Override
    public void setSize() {
        int x = getX2();
        int y = getY2();
        setX2(getX1()+x+y);
        setY2(getY1()+x+y);
    }

    @Override
    public String toString() {
        return "Rec";
    }
}
