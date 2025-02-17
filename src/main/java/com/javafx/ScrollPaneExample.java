package com.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class ScrollPaneExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("ScrollPane Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));

        TextArea textArea = new TextArea();
        textArea.setWrapText(true);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(textArea);
        scrollPane.setFitToWidth(true);

        Pane pane = new Pane();
        pane.getChildren().add(scrollPane);

        Scene scene = new Scene(pane,200,200);
        stage.setScene(scene);
        stage.show();

    }
}
