module com.example.wordoccurence {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.wordoccurence to javafx.fxml;
    exports com.example.wordoccurence;
}