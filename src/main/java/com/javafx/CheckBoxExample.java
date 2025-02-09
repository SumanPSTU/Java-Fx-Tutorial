package com.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CheckBoxExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("CheckBoxExample");
        CheckBox checkBox = new CheckBox("CheckBox1");
        CheckBox checkBox2 = new CheckBox("CheckBox2");
        CheckBox checkBox3 = new CheckBox("CheckBox3");
        ToggleGroup toggleGroup = new ToggleGroup();
        checkBox.setOnAction(e -> {
            if (checkBox.isSelected()) {
                checkBox2.setSelected(false);
                checkBox3.setSelected(false);
            }
        });

        checkBox2.setOnAction(e -> {
            if (checkBox2.isSelected()) {
                checkBox.setSelected(false);
                checkBox3.setSelected(false);
            }
        });

        checkBox3.setOnAction(e -> {
            if (checkBox3.isSelected()) {
                checkBox.setSelected(false);
                checkBox2.setSelected(false);
            }
        });
        HBox hbox = new HBox(checkBox, checkBox2, checkBox3);
        hbox.setSpacing(10);
        hbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(hbox,400,300);
        stage.setScene(scene);



        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
