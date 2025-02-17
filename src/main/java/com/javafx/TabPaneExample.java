package com.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.FileInputStream;

public class TabPaneExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("TabPane Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));

        // Create TabPane
        TabPane tabPane = new TabPane();

        // Create Tabs
        Tab tab1 = new Tab("Tab 1", new Label("Content for Tab 1"));
        Tab tab2 = new Tab("Tab 2", new Label("Content for Tab 2"));
        Tab tab3 = new Tab("Tab 3", new Label("Content for Tab 3"));

        // Add tabs to TabPane
        tabPane.getTabs().addAll(tab1, tab2, tab3);

        Pane pane = new Pane();
        pane.getChildren().addAll(tabPane);
        tabPane.getSelectionModel().select(0);

        Scene scene = new Scene(pane, 500, 400);

        // Show stage first to allow lookup()
        stage.setScene(scene);
        stage.show();

        // Apply inline styles after showing the stage
        applyTabStyles(tabPane);
    }

    private void applyTabStyles(TabPane tabPane) {
        // Apply styles dynamically to the tab headers
        tabPane.lookupAll(".tab").forEach(tab -> {
            String tabText = ((Label) tab.lookup(".tab-label")).getText();
            if (tabText.equals("Tab 1")) {
                tab.setStyle("-fx-background-color: #ffcccc; -fx-text-fill: black;"); // Light Red
            } else if (tabText.equals("Tab 2")) {
                tab.setStyle("-fx-background-color: #ccffcc; -fx-text-fill: black;"); // Light Green
            } else if (tabText.equals("Tab 3")) {
                tab.setStyle("-fx-background-color: #ccccff; -fx-text-fill: black;"); // Light Blue
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
