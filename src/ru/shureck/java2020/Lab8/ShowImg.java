package ru.shureck.java2020.Lab8;

import javax.swing.*;
import java.awt.*;

public class ShowImg extends JFrame{

    private static Image image;
    private static JFrame jFrame;
    private static String text;

    ShowImg(){
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
        Image image = new ImageIcon(text).getImage();
        gr2d.drawImage(image,0,0, 1280, 800, null);
    }

    public static void main(String[] args) {
        text = args[0];
        new ShowImg();
    }
}
