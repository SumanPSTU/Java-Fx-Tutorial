package com.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ColorPickerExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("ColorPicker Example");
        ColorPicker colorPicker = new ColorPicker();
        Pane pane = new Pane();
        pane.getChildren().add(colorPicker);

        colorPicker.setOnAction(event -> {
           Color c = colorPicker.getValue();
           pane.setBackground(new Background(new BackgroundFill(c,null, Insets.EMPTY)));
        });
        Scene scene = new Scene(pane,400,300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
