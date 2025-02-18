package com.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class ContextMenuItemExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("ContextMenuItem Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));

        ContextMenu contextMenu = new ContextMenu();
        MenuItem item1 = new MenuItem("Item 1");
        MenuItem item2 = new MenuItem("Item 2");
        MenuItem item3 = new MenuItem("Item 3");
        item3.setOnAction(event -> {
            System.out.println("Item 3 is clicked" );
        });
        item1.setOnAction(event -> {
            System.out.println("Item 1 is clicked" );
        });
        item2.setOnAction(event -> {
            System.out.println("Item 2 is clicked" );
        });

        contextMenu.getItems().addAll(item1, item2, item3);

        VBox vbox = new VBox();
        vbox.setOnContextMenuRequested(event -> contextMenu.show(vbox, event.getScreenX(), event.getScreenY()));

        stage.setScene(new Scene(vbox, 500, 400));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
