package com.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class AccordionExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Accordion Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));
        Accordion accordion = new Accordion();
        TitledPane titledPane1 = new TitledPane("TitledPane -1", new Label("Accordion Example -1"));
        TitledPane titledPane2 = new TitledPane("TitledPane -2", new Label("Accordion Example -2"));
        TitledPane titledPane3 = new TitledPane("TitledPane -2", new Label("Accordion Example -3"));
        accordion.setMinWidth(400);
        accordion.getPanes().addAll(titledPane1, titledPane2, titledPane3);
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().add(accordion);
        Scene scene = new Scene(hbox, 500, 400);
        stage.setScene(scene);
        stage.show();

    }
}
