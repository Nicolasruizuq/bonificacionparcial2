package co.edu.uniquindio.poo.bonificacionparcial2.viewController;

import co.edu.uniquindio.poo.bonificacionparcial2.controller.ProductoController;
import co.edu.uniquindio.poo.bonificacionparcial2.model.Producto;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.io.IOException;

public class ProductoViewController {
    @FXML private TableView<Producto> tablaProductos;
    @FXML private TableColumn<Producto, String> colNombre;
    @FXML private TableColumn<Producto, Double> colPrecio;
    @FXML private TableColumn<Producto, String> colComponentes;

    private final ProductoController controller = new ProductoController();

    @FXML
    private void initialize() {

        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));
        colComponentes.setCellValueFactory(new PropertyValueFactory<>("componentes"));

        tablaProductos.getItems().setAll(controller.obtenerProductos());
    }

    @FXML
    private void volver() {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/bonificacionparcial2/Bienvenido.fxml"));
            Parent root = loader.load();


            Stage stage = (Stage) tablaProductos.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            System.err.println("Error al volver a la vista principal:");
            e.printStackTrace();
        }
    }
}