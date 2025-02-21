package com.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class TransformationExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("TransformationExample");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));

        Rectangle rectangle = new Rectangle();
        rectangle.setX(200);
        rectangle.setY(200);
        rectangle.setWidth(300);
        rectangle.setHeight(400);
        rectangle.setStroke(Color.TRANSPARENT);
        rectangle.setFill(Color.valueOf("#00ffff"));

        double degrees = 30;
        double rotationPointX = 100;
        double rotationPointY = 100;
        Button rotateButton = new Button("Rotate");
        rotateButton.setOnAction(event -> {
            Rotate rotate = new Rotate(degrees, rotationPointX, rotationPointY);
            rectangle.getTransforms().add(rotate);
        });

        Button translateButton = new Button("Translate");
        translateButton.setOnAction(event -> {
            Translate translate = new Translate(50, 50); // Change these values to set the translation
            rectangle.getTransforms().add(translate);
        });

        VBox pane = new VBox();
        pane.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(rectangle, rotateButton, translateButton);

        Scene scene = new Scene(pane, 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
