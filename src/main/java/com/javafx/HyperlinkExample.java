package com.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class HyperlinkExample extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Hyperlink Example");

        // Create a label
        Label label = new Label("Click the link below:");

        // Create Hyperlink
        Hyperlink hyperlink = new Hyperlink("Visit Google 🌍");
        hyperlink.setStyle("-fx-text-fill: #0073e6; -fx-font-size: 16px; -fx-font-weight: bold;");
        hyperlink.setStyle("-fx-focus-color: transparent; -fx-faint-focus-color: transparent;");

        // Add hover effect
        hyperlink.setOnMouseEntered(e -> hyperlink.setStyle("-fx-text-fill: #005bb5; -fx-font-size: 16px; -fx-font-weight: bold; -fx-underline: true;"));
        hyperlink.setOnMouseExited(e -> hyperlink.setStyle("-fx-text-fill: #0073e6; -fx-font-size: 16px; -fx-font-weight: bold;"));

        // Open link on click
        hyperlink.setOnAction(event -> {
            try {
                Desktop.getDesktop().browse(new URI("https://www.google.com")); // Use https://
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        });

        // Layout (VBox)
        VBox vbox = new VBox(10, label, hyperlink);
        vbox.setAlignment(Pos.CENTER);

        // Scene
        Scene scene = new Scene(vbox, 500, 400);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
