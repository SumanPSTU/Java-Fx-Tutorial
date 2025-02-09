package com.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.awt.*;

public class SplitMenuExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("SplitMenuExample");
        SplitMenuButton smb = new SplitMenuButton();
        smb.setText("SMB");
        smb.setMinWidth(100);
        smb.setMinHeight(40);
        MenuItem smbItem = new MenuItem("option -1");
        MenuItem smbItem2 = new MenuItem("option -2");
        MenuItem smbItem3 = new MenuItem("option -3");
        MenuItem smbItem4 = new MenuItem("option -4");
        smb.getItems().addAll(smbItem, smbItem2, smbItem3, smbItem4);

        smbItem.setOnAction(e->{
            System.out.println("SMB selected");
        });
        HBox hb = new HBox(smb);
        hb.setSpacing(10);
        Scene scene = new Scene(hb,400,300);

        stage.setScene(scene);
        stage.show();
    }
}
