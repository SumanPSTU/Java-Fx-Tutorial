package com.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.InputStream;

public class TextExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Text Example");
        stage.setResizable(true);

        // Set stage icon
        InputStream input = new FileInputStream("icon/icon.png");
        Image icon = new Image(input);
        stage.getIcons().add(icon);

        // Create UI Elements
        Label label = new Label("This is a label");
        label.setFont(new Font("Arial", 20));

        TextField textField = new TextField();
        textField.setPromptText("Enter text here...");

        textField.setMaxWidth(150);

        Button button = new Button("Click Me");

        CheckBox checkBox = new CheckBox("I agree to the terms");

        RadioButton radioButton1 = new RadioButton("Option 1");
        RadioButton radioButton2 = new RadioButton("Option 2");
        button.setOnAction(e->{
            System.out.println(textField.getText().toString().toLowerCase());
        });
        ToggleGroup toggleGroup = new ToggleGroup();
        radioButton1.setToggleGroup(toggleGroup);
        radioButton2.setToggleGroup(toggleGroup);

        // Create VBox and center content
        VBox vBox = new VBox(10); // 10px spacing
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(label, textField, button, checkBox, radioButton1, radioButton2);

        // Create scene
        Scene scene = new Scene(vBox, 350, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
