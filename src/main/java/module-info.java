module com.example.creativer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.creativer to javafx.fxml;
    exports com.example.creativer;
}