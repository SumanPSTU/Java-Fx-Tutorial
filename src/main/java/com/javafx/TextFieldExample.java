package com.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class TextFieldExample extends Application {
    TextField[] textFields;

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("TextField Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));

        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.CENTER);
        textFields = new TextField[5];
        for (int i = 0; i < textFields.length; i++) {
            textFields[i] = new TextField();
            textFields[i].setMaxWidth(200);
            textFields[i].setMinHeight(40);
            textFields[i].setId(Integer.toString(i));
            int index = i;
            textFields[i].setOnAction((event) -> {
                System.out.println(textFields[index].getText());
            });
            vbox.getChildren().add(textFields[i]);
        }

        Scene scene = new Scene(vbox, 400, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
