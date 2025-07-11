package co.edu.udistrital.controller;

import co.edu.udistrital.model.GmailFacade;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
    private VistaConsola vista;
    private GmailFacade gmail;

    public Controller() {
        vista = new VistaConsola();
        gmail = new GmailFacade();
    }

    //Método de ejecución
    public void run() {
        vista.mostrarInformacion("Gmail: Cambio de contraseña");

        String contrasenaA= vista.leerCadena("Ingrese la contraseña anterior: ");
        String contrasenaN = vista.leerCadena("Ingrese la contraseña nueva: ");

        String resultado = gmail.cambioContrasena(contrasenaA, contrasenaN );
        vista.mostrarInformacion(resultado);
    }
}

