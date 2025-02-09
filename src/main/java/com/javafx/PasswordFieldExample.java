package com.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class PasswordFieldExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Password Field Example");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter Password");
        passwordField.setCursor(Cursor.HAND);
        passwordField.setFont(new Font("Arial", 20));
        passwordField.setMaxWidth(200);
        passwordField.setMinHeight(30);
        passwordField.setOnAction(event -> {
            String password = passwordField.getText();
            System.out.println(password.toString());
        });

        VBox vbox = new VBox();
        vbox.getChildren().add(passwordField);
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox,400,300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
