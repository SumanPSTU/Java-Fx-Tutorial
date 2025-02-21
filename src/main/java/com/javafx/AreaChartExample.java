package com.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class AreaChartExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Area Chart Example");
        stage.getIcons().add(new Image(new FileInputStream("icon/icon.png")));

        NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("No of employees");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Revenue per employee");

        AreaChart areaChart = new AreaChart(xAxis, yAxis);

        XYChart.Series dataSeries1 = new XYChart.Series();
        dataSeries1.setName("2014");

        dataSeries1.getData().add(new XYChart.Data( 1, 567));
        dataSeries1.getData().add(new XYChart.Data( 5, 612));
        dataSeries1.getData().add(new XYChart.Data(10, 800));
        dataSeries1.getData().add(new XYChart.Data(20, 780));
        dataSeries1.getData().add(new XYChart.Data(40, 810));
        dataSeries1.getData().add(new XYChart.Data(80, 850));

        areaChart.getData().add(dataSeries1);

        VBox vbox = new VBox(areaChart);

        Scene scene = new Scene(vbox, 400, 200);
        stage.setScene(scene);
        stage.show();

    }
}
