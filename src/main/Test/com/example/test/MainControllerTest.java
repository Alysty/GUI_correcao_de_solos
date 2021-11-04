package com.example.test;

import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import org.testfx.framework.junit5.ApplicationTest;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class MainControllerTest  extends ApplicationTest {

    @Override
    public void start (Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../solosgui/Main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Soil Correction");
        stage.setScene(scene);
        stage.show();
    }
    @Test
    void testMethodActionTextura() {

    }

    @Test
    void testMethodButtonCalcularFosforoAction() {
    }

    @Test
    void testMethodButtonCalcularCalcioMagAction() {
    }

    @Test
    void testMethodButtonCalcularPotassioAction() {
    }

    @Test
    void testMethodCalculaQuantidadeAplicar() {
    }
}