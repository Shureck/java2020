package ru.shureck.java2020.Lab12;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.text.Text;

import java.util.Random;

public class Controller {

    @FXML
    Text text1;
    @FXML
    ComboBox<Planet> splitBtn;


    public void initialize() {
        text1.setText("Выберите планету");
        ObservableList<Planet> list = FXCollections.observableArrayList(Planet.MERCURY, Planet.VENUS, Planet.EARTH, Planet.MARS, Planet.JUPITER, Planet.SATURN, Planet.URANUS, Planet.NEPTUNE);
        splitBtn.setItems(list);
        splitBtn.setPromptText("Планеты");
        splitBtn.valueProperty().addListener((obs, oldItem, newItem) -> {
            if (newItem == null) {
                System.out.println("");
            } else {
                text1.setText(String.valueOf(obs.getValue().surfaceGravity()));
            }
        });
    }

}