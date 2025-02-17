package com.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class VboxExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("VBox Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));
        VBox vbox = new VBox();
        Button button = new Button("Click Me");
        vbox.getChildren().add(button);
        Scene scene = new Scene(vbox, 300, 300);
        button.setOnAction(e -> {
            vbox.setStyle("-fx-background-color: #a04dc8");
        });
        stage.setScene(scene);
        stage.show();
    }
}
