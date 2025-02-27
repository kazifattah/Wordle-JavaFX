module org.example.wordleapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.wordleapp to javafx.fxml;
    exports org.example.wordleapp;
}