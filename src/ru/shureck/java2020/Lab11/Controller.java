package ru.shureck.java2020.Lab11;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.util.Random;

public class Controller{

    @FXML
    Text text1;
    @FXML
    TextField text2;
    @FXML
    Button ewe;

    public void initialize() {
        text1.setText("Введите число");
        Random random = new Random();
        int s = random.nextInt(20);
        ewe.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int k=0;
                try {
                    k = Integer.parseInt(text2.getText());
                    if(k<s){
                        text1.setText("Больше");
                        text2.setText("");
                    }
                    if(k>s){
                        text1.setText("Меньше");
                        text2.setText("");
                    }
                    if(k==s){
                        Label secondLabel = new Label("Вы угадали");
                        Lab11 lab11 = new Lab11();
                        StackPane secondaryLayout = new StackPane();
                        secondaryLayout.getChildren().add(secondLabel);
                        Scene secondScene = new Scene(secondaryLayout, 230, 100);
                        text1.setText("Ура!");
                        Stage newWindow = new Stage();
                        newWindow.setTitle("Ура!");
                        newWindow.setScene(secondScene);
                        newWindow.setOnCloseRequest(new EventHandler<WindowEvent>() {
                            @Override
                            public void handle(WindowEvent windowEvent) {
                                newWindow.close();
                                lab11.close();
                            }
                        });
                        newWindow.show();
                    }
                } catch (NumberFormatException e) {
                    text1.setText("Введено не число");
                    text2.setText("");
                }

            }
        });


    }
}