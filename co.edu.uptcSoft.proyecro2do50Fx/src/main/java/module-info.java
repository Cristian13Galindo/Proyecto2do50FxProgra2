module com.example.ejemplojfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens ui to javafx.fxml;
    exports ui;
    exports controlers;
    opens controlers to javafx.fxml;
}