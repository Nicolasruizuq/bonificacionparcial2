module co.edu.uniquindio.poo.bonificacionparcial2 {
    requires javafx.controls;
    requires javafx.fxml;

    exports co.edu.uniquindio.poo.bonificacionparcial2;
    exports co.edu.uniquindio.poo.bonificacionparcial2.viewController;
    exports co.edu.uniquindio.poo.bonificacionparcial2.model;

    opens co.edu.uniquindio.poo.bonificacionparcial2.viewController to javafx.fxml;
    opens co.edu.uniquindio.poo.bonificacionparcial2.model to javafx.base;
}