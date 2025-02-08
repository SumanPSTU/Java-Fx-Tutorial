package com.javafx;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class StageExample {
    public static void main(String[] args) {
        // Start JavaFX application thread
        Platform.startup(() -> {
            Stage stage = new Stage();
            stage.setTitle("JavaFX Example");
            stage.setResizable(true);
            //stage.initStyle(StageStyle.UNIFIED);

            AnchorPane pane = new AnchorPane();
            Button button = new Button("Click Me");
            pane.getChildren().add(button);
            button.setOnAction(event -> {
                System.out.println("Hello World");
            });
            Scene scene = new Scene(pane, 400, 400);
            stage.setScene(scene);
            stage.show();
        });
    }
}
