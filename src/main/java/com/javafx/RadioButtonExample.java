package com.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RadioButtonExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("RadioButtonExample");
        RadioButton radioButton = new RadioButton("Radio Button -1");
        RadioButton radioButton2 = new RadioButton("Radio Button -2");

        ToggleGroup toggleGroup = new ToggleGroup();
        radioButton.setToggleGroup(toggleGroup);
        radioButton2.setToggleGroup(toggleGroup);
        HBox hBox = new HBox();
        hBox.getChildren().addAll(radioButton, radioButton2);
        Scene scene = new Scene(hBox,400,300);
        stage.setScene(scene);

        stage.show();
    }
}
