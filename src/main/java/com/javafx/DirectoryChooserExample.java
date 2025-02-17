package com.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class DirectoryChooserExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Directory Chooser Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));
        Button btn = new Button("Choose Directory");
        btn.setOnAction(e -> {
            DirectoryChooser directoryChooser = new DirectoryChooser();
            File file = directoryChooser.showDialog(stage);
            if (file != null) {
                System.out.println(file.getAbsolutePath());
            }else {
                System.out.println("No File Selected");
            }
        });
        HBox hBox = new HBox();
        hBox.getChildren().add(btn);
        hBox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(hBox,500,400);
        stage.setScene(scene);
        stage.show();
    }
}
