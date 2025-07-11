package co.edu.udistrital.controller;

import co.edu.udistrital.model.*;
import co.edu.udistrital.model.concreto.Efectivo;
import co.edu.udistrital.model.concreto.Tarjeta;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
    private VistaConsola vista;
    private ManejadorPagos manejador;

    public Controller() {
        vista = new VistaConsola();
        manejador = new ManejadorPagos();
    }

    //Método de ejecución 
    public void run() {
        int opcion = menu();  

        if (opcion == 1 || opcion == 2) {
            double monto = vista.leerDatoEntero("Ingrese el monto a pagar: ");
            
            if (opcion == 1) {
                manejador.setMetodo(new Efectivo());
            } else {
                manejador.setMetodo(new Tarjeta());
            }

            String mensaje = manejador.procesarPago(monto);
            vista.mostrarInformacion(mensaje);
        } else if (opcion == 3) {
            vista.mostrarInformacion("Cerrando programa...");
        } else {
            vista.mostrarInformacion("Opción inválida.");
        }
    }

    //Método que muestra el ménu
    public int menu() {
        String menu = 
                "\nMENU DE OPCIONES\n"
                + "1. EFECTIVO\n"
                + "2. TARJETA\n"
                + "3. CANCELAR PAGO\n"
                + "Seleccione el método de pago para cancelar su pedido: ";
        return vista.leerDatoEntero(menu);
    }
}
