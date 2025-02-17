package com.javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class GroupExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Group Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));
        Button button = new Button("Click Me");
        Button button2 = new Button("Click Me button 2");

        Group group = new Group();
        group.getChildren().add(button2);
        group.getChildren().add(button);


        Scene scene = new Scene(group, 300, 300);
        stage.setScene(scene);
        stage.show();
    }
}
