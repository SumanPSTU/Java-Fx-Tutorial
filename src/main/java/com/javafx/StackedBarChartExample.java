package com.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class StackedBarChartExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Stacked Bar Chart Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));


        CategoryAxis xAxis    = new CategoryAxis();
        xAxis.setLabel("Devices");
        xAxis.getCategories().addAll("Desktop", "Phone", "Tablet");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Visits");

        StackedBarChart stackedBarChart = new StackedBarChart(xAxis, yAxis);

        XYChart.Series dataSeries1 = new XYChart.Series();
        dataSeries1.setName("Desktop");

        dataSeries1.getData().add(new XYChart.Data("2014", 567));
        dataSeries1.getData().add(new XYChart.Data("2015", 540));

        stackedBarChart.getData().add(dataSeries1);

        XYChart.Series dataSeries2 = new XYChart.Series();
        dataSeries2.setName("Phone");

        dataSeries2.getData().add(new XYChart.Data("2014"  , 65));
        dataSeries2.getData().add(new XYChart.Data("2015"  , 120));

        stackedBarChart.getData().add(dataSeries2);

        XYChart.Series dataSeries3 = new XYChart.Series();
        dataSeries3.setName("Tablet");

        dataSeries3.getData().add(new XYChart.Data("2014"  , 23));
        dataSeries3.getData().add(new XYChart.Data("2015"  , 36));

        stackedBarChart.getData().add(dataSeries3);

        VBox vbox = new VBox(stackedBarChart);

        Scene scene = new Scene(vbox, 400, 200);
        stage.setScene(scene);
        stage.show();

    }
}
