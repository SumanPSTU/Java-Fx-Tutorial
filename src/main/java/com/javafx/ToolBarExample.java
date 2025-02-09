package com.javafx;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class ToolBarExample extends Application {
    Button[] button;
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("ToolBar Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));
        button = new Button[6];
        for (int i = 0; i < 6; i++) {
            button[i] = new Button("Button " + (i + 1));
            int index = i+1;
            button[i].setOnAction(e -> {
                System.out.println("Button clicked at index " + index);
            });
        }
        ToolBar toolBar = new ToolBar();
        toolBar.setOrientation(Orientation.VERTICAL);
        toolBar.getItems().addAll(button);
        HBox hbox = new HBox();
        hbox.getChildren().add(toolBar);
        Scene scene = new Scene(hbox,500,400);
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
