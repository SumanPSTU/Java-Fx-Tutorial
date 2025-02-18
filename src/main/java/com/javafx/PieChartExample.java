package com.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class PieChartExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Pie Chart Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));
        PieChart pieChart = new PieChart();

        PieChart.Data slice1 = new PieChart.Data("Slice 1", 10);
        PieChart.Data slice2 = new PieChart.Data("Slice 2", 20);
        PieChart.Data slice3 = new PieChart.Data("Slice 3", 30);
        PieChart.Data slice4 = new PieChart.Data("Slice 4", 40);
        PieChart.Data slice5 = new PieChart.Data("Slice 5", 50);
        pieChart.getData().addAll(slice1, slice2, slice3, slice4, slice5);
        stage.setScene(new Scene(pieChart,500,400));
        stage.show();

    }
}
