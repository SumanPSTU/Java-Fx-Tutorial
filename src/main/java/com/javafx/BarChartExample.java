package com.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class BarChartExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Bar Chart Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));

        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Devices");
        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Visits");

        BarChart chart = new BarChart(xAxis, yAxis);
        XYChart.Series series = new XYChart.Series();
        XYChart.Series series2 = new XYChart.Series();
        chart.setStyle("-fx-background-color: rgba(43,68,188,0.2);-fx-bar-fill: rgba(87,186,58,0.71); ");

        series.setName("2025");
        series2.setName("2026");
        chart.getData().add(series);
        chart.getData().add(series2);

        series.getData().add(new XYChart.Data("Desktop", 67));
        series.getData().add(new XYChart.Data("Phone"  , 65));
        series.getData().add(new XYChart.Data("Tablet"  , 23));
        series.getData().add(new XYChart.Data("Mobile", 57));
        series.getData().add(new XYChart.Data("Watch"  , 65));
        series.getData().add(new XYChart.Data("Earphone"  , 23));

        series2.getData().add(new XYChart.Data("Desktop", 47));
        series2.getData().add(new XYChart.Data("Phone"  , 75));
        series2.getData().add(new XYChart.Data("Tablet"  , 43));
        series2.getData().add(new XYChart.Data("Mobile", 67));
        series2.getData().add(new XYChart.Data("Watch"  , 65));
        series2.getData().add(new XYChart.Data("Earphone"  , 23));




        VBox vbox = new VBox(chart);
        stage.setScene(new Scene(vbox,500,500));
        stage.show();
    }
}
