package com.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SliderExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Slider Example");
        Slider slider = new Slider();
        slider.setMin(0);
        slider.setMax(100);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(10);
        slider.setMinorTickCount(5);
        slider.setMaxWidth(250);
        slider.setSnapToTicks(true);
        slider.setStyle("-fx-background-color: rgba(210,73,244,0.65);");
        slider.valueProperty().addListener(observable -> {
            System.out.println(slider.getValue());
        });
        VBox vbox = new VBox();
        vbox.getChildren().add(slider);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox,400,300);
        stage.setScene(scene);
        stage.show();
    }
}
