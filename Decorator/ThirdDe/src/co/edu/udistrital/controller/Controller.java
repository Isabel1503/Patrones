package co.edu.udistrital.controller;

import co.edu.udistrital.model.ComidaRapida;
import co.edu.udistrital.model.Hamburguesa;
import co.edu.udistrital.model.ConCebolla;
import co.edu.udistrital.model.ConSalsaTomate;
import co.edu.udistrital.model.Perro;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;

    public Controller() {
        vista = new VistaConsola();
    }

  //Método de ejecución
    public void run() {
    	
        ComidaRapida comidaR= null;

        vista.mostrarInformacion("=== Bienvenido a Fast Food ===");
        vista.mostrarInformacion("1. Hamburguesa");
        vista.mostrarInformacion("2. Perro");

        int tipo = vista.leerDatoEntero("Seleccione su comida rápida: ");
        if (tipo == 1) {
        	comidaR = new Hamburguesa();
        } else if (tipo == 2) {
        	comidaR = new Perro();
        } else {
            vista.mostrarInformacion(null);
            return;
        }

        int op;
        do {
            vista.mostrarInformacion("\nSeleccione un ingrediente para añadir:");
            vista.mostrarInformacion("1. Salsa de tomate(+$500)");
            vista.mostrarInformacion("2.Cebolla (+$400)");
            vista.mostrarInformacion("0. Terminar y mostrar orden");

            op = vista.leerDatoEntero("Opción: ");
            switch (op) {
                case 1:comidaR = new ConSalsaTomate(comidaR); break;
                case 2: comidaR= new ConCebolla(comidaR); break;
                case 0: break;
                default: vista.mostrarInformacion(null);
            }

        } while (op != 0);

        vista.mostrarInformacion("\nSu Comida rápida: " + comidaR.getDescripcion());
        vista.mostrarInformacion("Total: $" + comidaR.getCosto());
	    }
}

