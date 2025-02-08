package com.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import java.io.FileInputStream;
import java.io.InputStream;

public class LableExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("LableExample");
        InputStream inputStream = new FileInputStream("icon/cloudy_sunny.png");
        Image image = new Image(inputStream);
        stage.getIcons().add(image);
        Label label = new Label("This is a label");
        label.setAlignment(Pos.CENTER);
        label.setFont(new Font("Arial", 20));


// Set text color using RGB values (normalized between 0 and 1)
        label.setTextFill(Color.rgb(223, 1, 34, 1));
        HBox hbox = new HBox(label);
        label.setBackground(new Background(
                new BackgroundFill(
                        Color.rgb(0, 53, 144, 0.2), // Color with opacity
                        new CornerRadii(5),         // Rounded corners (set 0 for sharp edges)
                        Insets.EMPTY                 // No padding
                )
        ));
        hbox.setSpacing(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.setBackground(new Background(new BackgroundFill(
                Color.web("B5456AE6",0.7),
                new CornerRadii(2),
                Insets.EMPTY
        )));
        Scene scene = new Scene(hbox, 300, 250);
        stage.setScene(scene);

        stage.setMinHeight(200);
        stage.setMinWidth(300);
        stage.setMaxHeight(500);
        stage.setMaxWidth(700);

        stage.show();
    }
}
