package com.example.primerproyectojavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button btEnviar;

    @FXML
    private Button btLimpiar;

    @FXML
    private Button btSalir;

    @FXML
    private TextField tfApellidos;

    @FXML
    private TextField tfNombre;

    @FXML
    void enviar(ActionEvent event) {
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Envio de datos");
        alert.setContentText("Los datos se han enviado correctamente");
        alert.showAndWait();
        limpiar(event);
    }

    @FXML
    void limpiar(ActionEvent event) {
        tfNombre.setText("");
        tfApellidos.setText("");
    }

    @FXML
    void salir(ActionEvent event) {
        System.exit(0);
    }

}
