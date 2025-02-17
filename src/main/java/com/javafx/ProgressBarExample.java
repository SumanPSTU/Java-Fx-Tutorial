package com.javafx;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ProgressBarExample extends Application {
    private ProgressBar progressBar = new ProgressBar(0);
    private Label progressLabel = new Label("0%");
    private double progress = 0;

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("ProgressBar with Text Example");

        // Configure ProgressBar
        progressBar.setMinWidth(200);

        // Create a StackPane to overlay Label on ProgressBar
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(progressBar, progressLabel);
        stackPane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(stackPane, 400, 300);
        stage.setScene(scene);
        stage.show();

        // Start the timer to update the progress bar and label
        startTimer();
    }

    private void startTimer() {
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            if (progress < 1) {
                progress += 0.1;
                progressBar.setProgress(progress);
                progressLabel.setText(String.format("%.0f%%", progress * 100));
                System.out.println("Progress: " + progress);
            }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
