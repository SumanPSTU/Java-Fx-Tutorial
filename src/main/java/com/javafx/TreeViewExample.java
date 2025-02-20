package com.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class TreeViewExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Tree View Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));

        // Create the root item
        TreeItem<String> rootItem = new TreeItem<>("Root");
        rootItem.setExpanded(true);

        // Add child items to the root item
        TreeItem<String> item1 = new TreeItem<>("Item 1");
        TreeItem<String> item2 = new TreeItem<>("Item 2");
        rootItem.getChildren().addAll(item1, item2);

        // Create the TreeView with the root item
        TreeView<String> treeView = new TreeView<>(rootItem);

        // Create a scene and add the TreeView to it
        Scene scene = new Scene(treeView, 300, 250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
