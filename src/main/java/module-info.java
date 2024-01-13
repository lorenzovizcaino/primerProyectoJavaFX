module com.example.primerproyectojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.primerproyectojavafx to javafx.fxml;
    exports com.example.primerproyectojavafx;
}