package com.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.chart.XYChart;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class StackedAreaChartExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Stacked Area Chart Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));

        NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("7 Day Interval");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Visits");

        StackedAreaChart stackedAreaChart = new StackedAreaChart(xAxis, yAxis);

        XYChart.Series dataSeries1 = new XYChart.Series();
        dataSeries1.setName("Desktop");

        dataSeries1.getData().add(new XYChart.Data( 0, 567));
        dataSeries1.getData().add(new XYChart.Data( 1, 612));
        dataSeries1.getData().add(new XYChart.Data( 2, 800));
        dataSeries1.getData().add(new XYChart.Data( 3, 780));
        dataSeries1.getData().add(new XYChart.Data( 4, 650));
        dataSeries1.getData().add(new XYChart.Data( 5, 610));
        dataSeries1.getData().add(new XYChart.Data( 6, 790));

        stackedAreaChart.getData().add(dataSeries1);

        XYChart.Series dataSeries2 = new XYChart.Series();
        dataSeries2.setName("Mobile");

        dataSeries2.getData().add(new XYChart.Data( 0, 101));
        dataSeries2.getData().add(new XYChart.Data( 1, 110));
        dataSeries2.getData().add(new XYChart.Data( 2, 140));
        dataSeries2.getData().add(new XYChart.Data( 3, 132));
        dataSeries2.getData().add(new XYChart.Data( 4, 115));
        dataSeries2.getData().add(new XYChart.Data( 5, 109));
        dataSeries2.getData().add(new XYChart.Data( 6, 105));

        stackedAreaChart.getData().add(dataSeries2);

        VBox vbox = new VBox(stackedAreaChart);

        Scene scene = new Scene(vbox, 400, 200);
        stage.setScene(scene);
        stage.show();

    }
}
