package com.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;

public class FileChooserExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("FileChooserExample");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));
        Button button = new Button("Open File");
        button.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open File");
            File file = fileChooser.showOpenDialog(stage);
            fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("All files","*.*"),
                    new FileChooser.ExtensionFilter("All files","*.jpg"),
                    new FileChooser.ExtensionFilter("All files","*.png"),
                    new FileChooser.ExtensionFilter("All files","*.gif")
            );
            if (file != null) {
                try {
                   Desktop.getDesktop().open(file);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }

        });

        HBox hBox = new HBox();
        hBox.getChildren().add(button);
        hBox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(hBox,400,500);
        stage.setScene(scene);
        stage.show();

    }
}
