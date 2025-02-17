package com.javafx;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.FileInputStream;


public class FlowPaneExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("FlowPane Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));
        FlowPane flowPane = new FlowPane();
        flowPane.setOrientation(Orientation.VERTICAL);
        Button[] buttons = new Button[8];
        for (int i = 0; i < 8; i++) {
            buttons[i] = new Button("Button " + (i+1));
            flowPane.getChildren().add(buttons[i]);
        }
        stage.setScene(new Scene(flowPane, 300, 300));
        stage.show();
    }
}
