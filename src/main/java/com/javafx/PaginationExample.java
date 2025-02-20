package com.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Pagination;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class PaginationExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Pagination Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));

        Pagination pagination = new Pagination();
        pagination.setPageCount(20);
        pagination.setPageFactory((pageIndex) -> {
            Label label1 = new Label("Content for page with index: " + pageIndex);
            label1.setFont(new Font("Arial", 24));

            Label label2 = new Label("Main content of the page ...");

            return new VBox(label1, label2);
        });

        VBox vbox = new VBox(pagination);
        vbox.setSpacing(10);
        Scene scene = new Scene(vbox, 500, 500);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
