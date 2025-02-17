package com.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
public class ToolTipExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("TooltipExample");
        Tooltip tooltip = new Tooltip();
        tooltip.setText("Tooltip Example");
        tooltip.setTextAlignment(TextAlignment.JUSTIFY);
        Button showButton = new Button("Show Tooltip");
        showButton.setTooltip(tooltip);
        HBox hbox = new HBox();
        hbox.getChildren().add(showButton);
        hbox.setSpacing(10);
        hbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(hbox, 300, 250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
