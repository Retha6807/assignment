module com.example.planegame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.planegame to javafx.fxml;
    exports com.example.planegame;
}