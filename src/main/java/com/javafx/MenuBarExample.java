package com.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class MenuBarExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Menu Bar Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));
        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        CheckMenuItem menuItem1 = new CheckMenuItem("Item 1");
        CheckMenuItem menuItem2 = new CheckMenuItem("Item 2");
        CheckMenuItem menuItem3 = new CheckMenuItem("Item 3");
        CheckMenuItem menuItem4 = new CheckMenuItem("Item 4");

        editMenu.getItems().addAll(menuItem1, menuItem2, menuItem3, menuItem4);

        MenuItem exitMenuItem = new MenuItem("Exit");
        MenuItem saveMenuItem = new MenuItem("Save");
        MenuItem loadMenuItem = new MenuItem("Load");
        fileMenu.getItems().addAll(exitMenuItem, saveMenuItem, loadMenuItem);
        menuBar.getMenus().addAll(fileMenu, editMenu);
        VBox vbox = new VBox();
        vbox.getChildren().add(menuBar);
        vbox.setAlignment(Pos.TOP_LEFT);

        stage.setScene(new Scene(vbox, 500, 400));
        stage.show();
    }
}
