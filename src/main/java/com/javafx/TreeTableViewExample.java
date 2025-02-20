package com.javafx;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;

import java.io.FileInputStream;

public class TreeTableViewExample extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("TreeTableView Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));

        // Creating the root item for the TreeTableView
        TreeItem<String> rootItem = new TreeItem<>("Root");
        rootItem.setExpanded(true);

        // Creating child items
        TreeItem<String> item1 = new TreeItem<>("Item 1");
        TreeItem<String> item2 = new TreeItem<>("Item 2");
        TreeItem<String> item3 = new TreeItem<>("Item 3");

        // Adding child items to the root item
        rootItem.getChildren().addAll(item1, item2, item3);

        // Creating columns for the TreeTableView
        TreeTableColumn<String, String> column = new TreeTableColumn<>("Column");
        column.setPrefWidth(200);
        column.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().getValue()));

        // Creating the TreeTableView
        TreeTableView<String> treeTableView = new TreeTableView<>(rootItem);
        treeTableView.getColumns().add(column);
        treeTableView.setColumnResizePolicy(TreeTableView.CONSTRAINED_RESIZE_POLICY);

        // Creating a layout and adding the TreeTableView to it
        VBox vbox = new VBox(treeTableView);

        // Creating a scene and adding the layout to it
        Scene scene = new Scene(vbox, 300, 250);
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
