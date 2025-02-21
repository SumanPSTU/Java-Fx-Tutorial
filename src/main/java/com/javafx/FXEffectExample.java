package com.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class FXEffectExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("FX Effect Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));

        DropShadow dropShadow1 = new DropShadow();
        dropShadow1.setRadius(1);
        dropShadow1.setOffsetX(10);
        dropShadow1.setOffsetY(10);
        dropShadow1.setColor(Color.web("#333333"));

        Circle circle1 = new Circle(75, 75, 50, Color.RED);
        circle1.setEffect(dropShadow1);

        DropShadow dropShadow2 = new DropShadow();
        dropShadow2.setRadius(5);
        dropShadow2.setOffsetX(20);
        dropShadow2.setOffsetY(20);
        dropShadow2.setColor(Color.web("#660066"));

        Circle circle2 = new Circle(200, 75, 50, Color.GREEN);
        circle2.setEffect(dropShadow2);

        DropShadow dropShadow3= new DropShadow();
        dropShadow3.setRadius(25);
        dropShadow3.setOffsetX(30);
        dropShadow3.setOffsetY(30);
        dropShadow3.setColor(Color.web("#006666"));

        Circle circle3 = new Circle(325, 75, 50, Color.BLUE);
        circle3.setEffect(dropShadow3);

        Reflection reflection = new Reflection();
        reflection.setTopOffset(0);
        reflection.setTopOpacity(0.75);
        reflection.setBottomOpacity(0.10);
        reflection.setFraction(0.7);

        circle3.setEffect(reflection);

        Pane pane1 = new Pane();
        pane1.getChildren().add(circle1);
        pane1.getChildren().add(circle2);
        pane1.getChildren().add(circle3);

        Scene scene = new Scene(pane1, 800, 600);
        stage.setScene(scene);
        stage.show();


    }
}
