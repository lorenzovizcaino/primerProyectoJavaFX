package com.example.primerproyectojavafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 200, 300);
//        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("viewBorderPane.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
//        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("viewHBox.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 900, 100);
//        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("viewVBox.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 150, 350);
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("viewStackPane_HBox.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1100, 100);
        stage.setTitle("Identificacion");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}