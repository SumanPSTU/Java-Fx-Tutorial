package com.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextAreaExample extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("TextArea Example");

        TextArea textArea = new TextArea();
        textArea.setWrapText(true);
        VBox vbox = new VBox();
        vbox.getChildren().add(textArea);

        Scene scene = new Scene(vbox, 300, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
