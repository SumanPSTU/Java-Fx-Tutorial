package com.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ToggleButtonExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Toggle Button Example");
        ToggleButton toggleButton = new ToggleButton("Toggle Button");
        toggleButton.setOnAction(e -> {
            if (toggleButton.isSelected()) {
                System.out.println("Toggle Button is selected");
            }else {
                System.out.println("Toggle Button is unselected");
            }
        });
        HBox hBox = new HBox(toggleButton);
        hBox.setSpacing(10);
        Scene scene = new Scene(hBox,400,300);
        stage.setScene(scene);


        stage.show();
    }
}
