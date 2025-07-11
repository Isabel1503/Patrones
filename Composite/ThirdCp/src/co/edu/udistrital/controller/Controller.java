package co.edu.udistrital.controller;

import co.edu.udistrital.model.Menu;
import co.edu.udistrital.model.Opcion;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
    private VistaConsola vista;
    private Menu menuPrincipal;

    public Controller() {
        vista = new VistaConsola();
    }

    public void run() {
        // Crear estructura de menús
        menuPrincipal = new Menu("Menú Principal");

        menuPrincipal.agregar(new Opcion("Ver perfil"));
        menuPrincipal.agregar(new Opcion("Ajustes"));

        Menu submenuSeguridad = new Menu("Submenú Seguridad");
        submenuSeguridad.agregar(new Opcion("Cambiar contraseña"));

        menuPrincipal.agregar(submenuSeguridad);

        vista.mostrarInformacion("\n MENÚ DE LA APLICACIÓN:\n");
        vista.mostrarInformacion(menuPrincipal.mostrar(""));
    }
}
