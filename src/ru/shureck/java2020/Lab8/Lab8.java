package ru.shureck.java2020.Lab8;

import ru.shureck.java2020.Lab6.MovableCircle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class Lab8 extends JFrame {
    Lab8(){
        super("Test");
        setLayout(new FlowLayout());
        setSize(1920,1080);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        // Рисуем простые линии
        ArrayList<Shape> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            if(random.nextBoolean()) {
                list.add(new Circle(random.nextInt(800),random.nextInt(800),random.nextInt(120)));
            }
            else{
                list.add(new Rectangle(random.nextInt(800),random.nextInt(800),random.nextInt(120),random.nextInt(120)));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            float hue = random.nextFloat();
            float saturation = (random.nextInt(2000) + 1000) / 10000f;
            float luminance = 0.9f;
            final Color color = Color.getHSBColor(hue, saturation, luminance);
            BasicStroke с = new BasicStroke(random.nextInt(1000)/100);
            gr2d.setColor(color);
            gr2d.setStroke(с);
            if(list.get(i).toString().equals("Rec")){
                gr2d.drawRect(list.get(i).getX1(),list.get(i).getY1(),list.get(i).getX2(),list.get(i).getY2());
            }
            else {
                gr2d.drawOval(list.get(i).getX1(),list.get(i).getY1(),list.get(i).getX2(),list.get(i).getX2());
            }
        }
    }

    public static void main(String[] args) {
        new Lab8();
    }
}
