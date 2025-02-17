package com.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;

public class HboxExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("HBox Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));

        Button button = new Button("Click Me button");

        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().add(button);
        Scene scene = new Scene(hbox, 300, 300);
        stage.setScene(scene);
        stage.show();
    }
}
