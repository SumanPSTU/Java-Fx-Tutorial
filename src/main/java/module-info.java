module com.javafx.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javafx to javafx.fxml;
    exports com.javafx;
}