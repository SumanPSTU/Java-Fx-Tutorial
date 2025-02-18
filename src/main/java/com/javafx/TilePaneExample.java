package com.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class TilePaneExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("TilePane Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));

        TilePane pane = new TilePane();
        pane.setAlignment(Pos.TOP_LEFT);
        pane.setHgap(10);
        pane.setVgap(10);

        Button[] buttons = new Button[10];
        for (int i = 0; i < 10; i++) {
            buttons[i] = new Button("Button " + (i+1));
            buttons[i].setMinWidth(100);
            buttons[i].setMinHeight(40);
            pane.getChildren().add(buttons[i]);
        }
        Scene scene = new Scene(pane,400,500);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
