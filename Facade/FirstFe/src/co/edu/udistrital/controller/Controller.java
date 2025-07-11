package co.edu.udistrital.controller;

import co.edu.udistrital.model.TiendaFacade;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
    private VistaConsola vista;
    private TiendaFacade tienda;

    public Controller() {
        vista = new VistaConsola();
        tienda = new TiendaFacade();
    }

    //Método de ejecución
    public void run() {
        vista.mostrarInformacion("Bienvenido a la Tienda ===");

        String producto = vista.leerCadena("Ingrese el nombre del producto: ");
        double precio = vista.leerDatoDouble("Ingrese el valor a pagar: ");

        String resultado = tienda.comprarProducto(producto, precio);
        vista.mostrarInformacion(resultado);
    }
}

