module com.javafx.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.javafx to javafx.fxml;
    exports com.javafx;
}