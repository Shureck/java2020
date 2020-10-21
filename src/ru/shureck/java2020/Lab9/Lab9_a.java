package ru.shureck.java2020.Lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab9_a extends JFrame {
    JTextField jTextField = new JTextField(10);
    JTextField jText = new JTextField(10);
    JButton jButton = new JButton("Result");
    Font font = new Font("Times new roman", Font.BOLD,20);
    Lab9_a(){
        super("Test");
        setLayout(new FlowLayout());
        setSize(250,200);
        jButton.setFont(font);
        add(new JLabel("1st Number"));
        add(jTextField);
        add(new JLabel("2st Number"));
        add(jText);
        add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 = Double.parseDouble(jTextField.getText().trim());
                    double x2 = Double.parseDouble(jText.getText().trim());

                    JOptionPane.showMessageDialog(null, "Result = " + (x1 + x2), "Result", JOptionPane.INFORMATION_MESSAGE);
                }catch (Exception error){
                    JOptionPane.showMessageDialog(null, "Поздравляю. Ты не отличаешь чиселки от буковок", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true);
    }
    public static void main(String[] args) {
        new Lab9_a();
    }
}
