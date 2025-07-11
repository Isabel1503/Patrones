package co.edu.udistrital.controller;

import co.edu.udistrital.model.Entorno;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
    private VistaConsola vista;
    private Entorno entorno;


    public Controller() {
        vista = new VistaConsola();
        entorno = new Entorno();
    }

    public void run() {
        vista.mostrarInformacion("Bienvenido al sistema de coordenadas de personajes");

        for (int i = 0; i < 2; i++) {
            int x = vista.leerDatoEntero("Posición X: ");
            int y = vista.leerDatoEntero("Posición Y: ");
            String nombre = vista.leerCadena("Tipo de personaje: ");
            String color = vista.leerCadena("Color: ");

            entorno.ubicar(x, y, nombre, color);
        }

        vista.mostrarInformacion("\nMostrando todos los personajes...\n");
        vista.mostrarInformacion(entorno.mostrarTodos());
    }
}



