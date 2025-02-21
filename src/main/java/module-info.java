module com.javafx.javafx {
    requires javafx.fxml;
    requires javafx.web;
    requires java.desktop;
    requires javafx.media;


    opens com.javafx to javafx.fxml;
    exports com.javafx;
}