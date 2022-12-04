module com.example.mycommerce {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mycommerce to javafx.fxml;
    exports com.example.mycommerce;
}