package co.edu.udistrital.controller;

import co.edu.udistrital.model.Bosque;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
    private VistaConsola vista;
    private Bosque bosque;

    public Controller() {
        vista = new VistaConsola();
        bosque = new Bosque();
    }

    public void run() {
        vista.mostrarInformacion("Bienvenido al simulador de bosque");

        for (int i = 0; i < 2; i++) {
            int x = vista.leerDatoEntero("Posición X: ");
            int y = vista.leerDatoEntero("Posición Y: ");
            String nombre = vista.leerCadena("Tipo de árbol: ");
            String color = vista.leerCadena("Color: ");
            String textura = vista.leerCadena("Textura: ");

            bosque.plantar(x, y, nombre, color, textura);
        }

        vista.mostrarInformacion("\nMostrando todos los árboles...\n");
       vista.mostrarInformacion(bosque.mostrarTodos());
    }
}



