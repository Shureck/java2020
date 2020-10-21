package ru.shureck.java2020.Lab13;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Lab13{

    public static void main(String[] args) {
        Students students = new Students();
        students.setArrayList();
        students.sort();
        students.show();
    }

}
