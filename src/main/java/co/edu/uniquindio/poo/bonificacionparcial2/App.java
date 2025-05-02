package co.edu.uniquindio.poo.bonificacionparcial2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/co/edu/uniquindio/poo/bonificacionparcial2/Bienvenido.fxml")));

            Scene scene = new Scene(root, 600, 400);
            stage.setTitle("Sistema de Gestión");
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            System.err.println("Error al iniciar: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}