package com.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class PaneExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Pane Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));

        Button button = new Button("Click Me button");

        Pane pane = new Pane();
        pane.getChildren().add(button);

        button.setOnAction(e -> {
            pane.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));
        });

        Scene scene = new Scene(pane, 300, 300);
        stage.setScene(scene);
        stage.show();
    }
}
