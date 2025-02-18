package com.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.util.Scanner;

public class WebViewExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Web View Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));

        WebView webView = new WebView();
        String url ;
        System.out.println("Enter URL");
        url = new Scanner(System.in).nextLine();
        webView.getEngine().load(url);

        VBox vBox = new VBox(webView);
        Scene scene = new Scene(vBox, 960, 600);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
