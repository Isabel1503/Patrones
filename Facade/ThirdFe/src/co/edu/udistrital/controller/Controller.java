package co.edu.udistrital.controller;

import co.edu.udistrital.model.NequiFacade;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
    private VistaConsola vista;
    private NequiFacade nequi;

    public Controller() {
        vista = new VistaConsola();
        nequi = new NequiFacade();
    }

    //Método de ejecución
    public void run() {
        vista.mostrarInformacion("NEQUI - ENEL");

        String cuenta = vista.leerCadena("Ingrese el número de cuenta de enel: ");
        double precio = vista.leerDatoDouble("Ingrese el valor a pagar: ");

        String resultado = nequi.pagarCuenta(cuenta, precio);
        vista.mostrarInformacion(resultado);
    }
}

