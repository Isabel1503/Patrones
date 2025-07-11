package co.edu.udistrital.controller;

import co.edu.udistrital.model.Bodega;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
    private VistaConsola vista;
    private Bodega bodega;


    public Controller() {
        vista = new VistaConsola();
        bodega = new Bodega();
    }

    public void run() {
        vista.mostrarInformacion("Bienvenido al sistema de ubicación de carros");

        for (int i = 0; i < 2; i++) {
            int x = vista.leerDatoEntero("Posición X: ");
            int y = vista.leerDatoEntero("Posición Y: ");
            String nombre = vista.leerCadena("Tipo de carro: ");
            String color = vista.leerCadena("Color: ");

            bodega.ubicar(x, y, nombre, color);
        }

        vista.mostrarInformacion("\nMostrando todos los carros...\n");
        vista.mostrarInformacion(bodega.mostrarTodos());
    }
}



