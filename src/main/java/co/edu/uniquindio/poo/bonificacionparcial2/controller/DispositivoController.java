package co.edu.uniquindio.poo.bonificacionparcial2.controller;

import co.edu.uniquindio.poo.bonificacionparcial2.model.*;
import java.util.List;

public class DispositivoController {
    public List<Dispositivo> obtenerDispositivos() {
        return List.of(
                new DetectorIntrusos(new DispositivoSimple("Cámara Principal", true, 3)),
                new DetectorIntrusos(new DispositivoSimple("Cámara Trasera", true, 2)),
                new DetectorIntrusos(new DispositivoSimple("Cámara Entrada", false, 1)),
                new DetectorIntrusos(new DispositivoSimple("Cámara Garaje", true, 2)),
                
                new Firewall(new DispositivoSimple("Sensor Ventana 1", false, 2)),
                new Firewall(new DispositivoSimple("Sensor Ventana 2", true, 1)),
                new Firewall(new DispositivoSimple("Sensor Puerta", true, 3)),
                new Firewall(new DispositivoSimple("Sensor Movimiento", false, 2))
        );
    }
}