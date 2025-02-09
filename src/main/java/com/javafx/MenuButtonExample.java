package com.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.InputStream;

public class MenuButtonExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("MenuButtonExample");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));

        MenuItem menuItem1 = new MenuItem("Option 1");
        MenuItem menuItem2 = new MenuItem("Option 2");
        MenuItem menuItem3 = new MenuItem("Option 3");

        InputStream input = new FileInputStream("icon/icon.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);

        // Set fixed size for the ImageView
        imageView.setFitWidth(20);
        imageView.setFitHeight(20);
        ImageView imageView2 = new ImageView(image);
        imageView2.setFitWidth(20);
        imageView2.setFitHeight(20);

        menuItem1.setGraphic(imageView2); // Keep a new ImageView for each MenuItem

        MenuButton menuButton = new MenuButton("Options", imageView, menuItem1, menuItem2, menuItem3);

        HBox hbox = new HBox(menuButton);


        Scene scene = new Scene(hbox, 400, 300);
        stage.setScene(scene);
        stage.show();
    }
}
