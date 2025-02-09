package com.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.InputStream;

public class ButtonExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Button Example");
        InputStream input = new FileInputStream("icon/icon.png");
        Image image = new Image(input);
        stage.getIcons().add(image);
        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.setAlignment(Pos.CENTER);
        Button button = new Button("Click me");
        hbox.getChildren().add(button);
        Scene scene = new Scene(hbox,400,300);
        button.setOnAction(e -> {
            System.out.println("Button clicked");
        });
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
