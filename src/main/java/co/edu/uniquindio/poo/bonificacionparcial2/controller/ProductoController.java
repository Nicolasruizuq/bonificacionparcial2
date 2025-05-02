package co.edu.uniquindio.poo.bonificacionparcial2.controller;

import co.edu.uniquindio.poo.bonificacionparcial2.model.*;
import java.util.List;

public class ProductoController {
    public List<Producto> obtenerProductos() {
        return List.of(
                new Producto.Builder()
                        .setNombre("Chocoramo")
                        .addComponente("Ponque")
                        .addComponente("Bolsa")
                        .addComponente("Etiqueta")
                        .setPrecio(2000)
                        .build(),

                new Producto.Builder()
                        .setNombre("Jugo Hit")
                        .addComponente("Jugo de mango")
                        .addComponente("Botella")
                        .addComponente("Tapa")
                        .setPrecio(3000)
                        .build(),

                new Producto.Builder()
                        .setNombre("Brownie")
                        .addComponente("Arequipe")
                        .addComponente("Bolsa")
                        .addComponente("Etiqueta")
                        .setPrecio(3500)
                        .build(),

                new Producto.Builder()
                        .setNombre("Chocolatina Jet")
                        .addComponente("Chocolate")
                        .addComponente("Sticker")
                        .addComponente("Envoltura")
                        .setPrecio(1000)
                        .build(),

                // Platos principales
                new Producto.Builder()
                        .setNombre("Papas de Limón")
                        .addComponente("Papas")
                        .addComponente("Bolsa")
                        .setPrecio(3000)
                        .build(),

                new Producto.Builder()
                        .setNombre("BonBonBun")
                        .addComponente("Palito")
                        .addComponente("Caramelo")
                        .setPrecio(1000)
                        .build(),

                // Snacks saludables
                new Producto.Builder()
                        .setNombre("Redbull")
                        .addComponente("Cafeína")
                        .addComponente("Lata")
                        .setPrecio(5000)
                        .build(),

                new Producto.Builder()
                        .setNombre("Mr Tea")
                        .addComponente("Té")
                        .addComponente("Botella")
                        .addComponente("Tapa")
                        .setPrecio(3500)
                        .build(),

                // Jugos especiales
                new Producto.Builder()
                        .setNombre("Nucita")
                        .addComponente("Chocolate")
                        .addComponente("Envoltura")
                        .setPrecio(1000)
                        .build(),

                new Producto.Builder()
                        .setNombre("Pinguinos")
                        .addComponente("Ponque")
                        .addComponente("Chocolate")
                        .addComponente("Envoltura")
                        .setPrecio(4000)
                        .build()
        );
    }
}