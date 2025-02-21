package com.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class FX2DExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("FX2D Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));

        Circle circle = new Circle();
        circle.setRadius(120);
        circle.setCenterX(250); // Set a fixed position for the circle
        circle.setCenterY(250); // Set a fixed position for the circle

        circle.setStyle("-fx-fill: #ae34cd;"); // Set the fill color of the circle

        Rectangle rectangle = new Rectangle();
        rectangle.setX(200);
        rectangle.setY(200);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setStroke(Color.TRANSPARENT);
        rectangle.setStyle("-fx-fill: #2b44bc;");

        Pane pane  = new Pane();
        pane.getChildren().add(circle);
        pane.getChildren().add(rectangle);
        Scene scene = new Scene(pane, 500, 500); // Set the scene size
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
