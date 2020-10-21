package ru.shureck.java2020.Lab9;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AnimImg extends JFrame{

    private static Image image;
    private static JFrame jFrame;
    private static String text;
    private static ArrayList<Image> framlist = new ArrayList<>();

    AnimImg(){
        super("Test");
        setLayout(new FlowLayout());
        setSize(1280,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        //gr2d.drawImage(new ImageIcon("src/ru/shureck/java2020/Lab8/IMG_20190702_203114.jpg").getImage(),0,0, 1280, 900, null);
        //image = new ImageIcon(text).getImage();
        gr2d.drawImage(image,0,0, 1280, 800, null);
    }

    public static void main(String[] args) {
        new AnimImg();
        framlist.add(new ImageIcon("src/ru/shureck/java2020/Lab8/IMG_20190702_201700.jpg").getImage());
        framlist.add(new ImageIcon("src/ru/shureck/java2020/Lab8/IMG_20190702_203114.jpg").getImage());
        AnimImg animImg = new AnimImg();
        while(true){
            for (int i = 0; i < 2; i++) {
                image = framlist.get(i);
                animImg.repaint();
                try {
                    Thread.sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
