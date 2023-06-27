package com.senac.arithomazini.bibliotecadesktop;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    protected void onHelloButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("cadastrarPessoa.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 960, 720);
        Stage stage = new Stage();
        stage.setTitle("Cadastrar Pessoa");
        stage.setScene(scene);
        stage.show();
    }
}