package co.edu.uniquindio.poo.bonificacionparcial2.viewController;

import co.edu.uniquindio.poo.bonificacionparcial2.controller.DispositivoController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class DispositivoViewController {
    public TableView tablaDispositivos;
    @FXML private ListView<String> listaDispositivos;

    @FXML
    private void initialize() {
        DispositivoController controller = new DispositivoController();
        listaDispositivos.getItems().setAll(
                controller.obtenerDispositivos().stream()
                        .map(d -> d.estado())
                        .toList()
        );
    }
    @FXML
    private void volver() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/bonificacionparcial2/Bienvenido.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) listaDispositivos.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            System.err.println("Error al volver a la vista principal:");
            e.printStackTrace();
        }
    }
}