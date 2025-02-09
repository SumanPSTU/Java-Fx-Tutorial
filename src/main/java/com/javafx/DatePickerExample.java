package com.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePickerExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Date Picker Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));

        DatePicker datePicker = new DatePicker();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        datePicker.setOnAction(event -> {
            LocalDate localDate = datePicker.getValue();
            System.out.println(localDate.format(formatter));
        });
        datePicker.setEditable(false);

        Pane pane = new Pane();
        pane.getChildren().add(datePicker);
        Scene scene = new Scene(pane,400,300);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
