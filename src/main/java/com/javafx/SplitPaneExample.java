package com.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class SplitPaneExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("SplitPane Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));

        //create split pane object
        SplitPane splitPane = new SplitPane();
        VBox vBox = new VBox(new Label("left split pane"));
        vBox.setAlignment(Pos.CENTER);
        VBox vBox2 = new VBox(new Label("right split pane"));
        vBox2.setAlignment(Pos.CENTER);

        //add vbox into split pane
        splitPane.getItems().addAll(vBox, vBox2);
        splitPane.setDividerPositions(0.5);

        Scene scene = new Scene(splitPane,500,400);
        stage.setScene(scene);
        stage.show();
    }
}
