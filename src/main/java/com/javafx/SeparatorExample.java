package com.javafx;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class SeparatorExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("SeparatorExample");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));

        Button[] buttons = new Button[5];
        Separator[] separators = new Separator[5];
        HBox hbox = new HBox();
        hbox.setSpacing(10);
        for (int i = 0; i < 5; i++) {
            buttons[i] = new Button("Button " + (i + 1));
            separators[i] = new Separator();
            separators[i].setOrientation(Orientation.VERTICAL);
            separators[i].setMaxHeight(30);
            hbox.getChildren().add(buttons[i]);
            if (i<4)
                hbox.getChildren().add(separators[i]);

        }
        stage.setScene(new Scene(hbox, 300, 300));
        stage.show();
    }
}
