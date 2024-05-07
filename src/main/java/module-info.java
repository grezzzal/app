module com.example.testapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testapp to javafx.fxml;
    exports com.example.testapp;
}