module com.example.solosgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.solosgui to javafx.fxml;
    exports com.example.solosgui;
}