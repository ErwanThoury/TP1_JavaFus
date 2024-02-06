module sio.tp1_javafus {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.tp1_javafus to javafx.fxml;
    exports sio.tp1_javafus;
}