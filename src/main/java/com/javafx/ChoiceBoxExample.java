package com.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class ChoiceBoxExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ChoiceBox<String> choiceBox = new ChoiceBox<String>();
        choiceBox.getItems().addAll("A", "B", "C");
        choiceBox.setValue("A");

        HBox hbox = new HBox();
        hbox.getChildren().add(choiceBox);
        hbox.setSpacing(10);

        Scene scene = new Scene(hbox, 400, 300);
        updateBackground(hbox, Color.GREEN); // Set initial color

        choiceBox.setOnAction(e -> {
            if (choiceBox.getValue().equals("A")) {
                updateBackground(hbox, Color.GREEN);
            } else if (choiceBox.getValue().equals("B")) {
                updateBackground(hbox, Color.RED);
            } else if (choiceBox.getValue().equals("C")) {
                updateBackground(hbox, Color.BLUE);
            }
        });

        stage.setScene(scene);
        stage.setTitle("Choice Box Example");
        stage.show();
    }

    private void updateBackground(HBox hbox, Color color) {
        hbox.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
