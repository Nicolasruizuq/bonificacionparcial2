package co.edu.uniquindio.poo.bonificacionparcial2.viewController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.IOException;

public class BienvenidoViewController {

    @FXML
    private void irAProductos(ActionEvent event) throws IOException {
        cargarVista("Productos.fxml", event);
    }

    @FXML
    private void irADispositivos(ActionEvent event) {
        try {
            System.out.println("Intentando cargar Dispositivos.fxml...");

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/bonificacionparcial2/Dispositivos.fxml"));
            Parent root = loader.load();


            if (root == null) {
                throw new IOException("No se pudo cargar el archivo FXML");
            }

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

            System.out.println("Dispositivos.fxml cargado correctamente"); // Debug

        } catch (IOException e) {
            System.err.println("Error al cargar Dispositivos.fxml:");
            e.printStackTrace();

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("No se pudo cargar la vista de dispositivos");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
        }
    }

    private void cargarVista(String fxml, ActionEvent event) throws IOException {
        try {
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            String rutaCompleta = "/co/edu/uniquindio/poo/bonificacionparcial2/" + fxml;
            System.out.println("Cargando: " + rutaCompleta);  // Para depuración

            Parent root = FXMLLoader.load(getClass().getResource(rutaCompleta));

            if (root == null) {
                throw new IOException("No se encontró el archivo: " + rutaCompleta);
            }

            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            System.err.println("Error al cargar " + fxml + ": " + e.getMessage());
            throw e;
        }
    }
}