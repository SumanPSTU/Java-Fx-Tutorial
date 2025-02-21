package com.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;

public class MediaPlayerExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Media Player Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));

        File mediaFile = new File("C:\\Users\\Sumon\\Downloads\\5139026-hd_1280_720_30fps.mp4");
        Media media = new Media(mediaFile.toURI().toString());

        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        // Create control buttons
        Button playButton = new Button("Play");
        playButton.setOnAction(e -> mediaPlayer.play());

        Button pauseButton = new Button("Pause");
        pauseButton.setOnAction(e -> mediaPlayer.pause());

        Button stopButton = new Button("Stop");
        stopButton.setOnAction(e -> mediaPlayer.stop());

        // Create a volume slider
        Slider volumeSlider = new Slider();
        volumeSlider.setMin(0);
        volumeSlider.setMax(1);
        volumeSlider.setValue(0.5);
        mediaPlayer.volumeProperty().bind(volumeSlider.valueProperty());

        // Create jump buttons
        Button jumpForwardButton = new Button("Jump Forward 10s");
        jumpForwardButton.setOnAction(e -> mediaPlayer.seek(mediaPlayer.getCurrentTime().add(javafx.util.Duration.seconds(10))));

        Button jumpBackwardButton = new Button("Jump Backward 10s");
        jumpBackwardButton.setOnAction(e -> mediaPlayer.seek(mediaPlayer.getCurrentTime().subtract(javafx.util.Duration.seconds(10))));

        // Add controls to a HBox
        HBox controls = new HBox(10, playButton, pauseButton, stopButton, jumpForwardButton, jumpBackwardButton, volumeSlider);

        // Add mediaView and controls to a BorderPane
        Pane root = new Pane(mediaView,controls);


        Scene scene = new Scene(root, 1024, 800);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
