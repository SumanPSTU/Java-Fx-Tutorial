package com.javafx;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class HTMLEditorExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("JavaFX HTML Editor Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));

        HTMLEditor htmlEditor = new HTMLEditor();
        htmlEditor.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        // Use VBox to make the HTMLEditor responsive
        VBox vbox = new VBox(htmlEditor);
        VBox.setVgrow(htmlEditor, javafx.scene.layout.Priority.ALWAYS);

        Scene scene = new Scene(vbox, 500, 500);

        // Bind the prefWidth and prefHeight properties of HTMLEditor to the scene's width and height
        htmlEditor.prefWidthProperty().bind(vbox.widthProperty());
        htmlEditor.prefHeightProperty().bind(vbox.heightProperty());

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
