package co.edu.udistrital.controller;

import co.edu.udistrital.model.Bebida;
import co.edu.udistrital.model.Cafe;
import co.edu.udistrital.model.ConCanela;
import co.edu.udistrital.model.ConLeche;
import co.edu.udistrital.model.Te;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;

    public Controller() {
        vista = new VistaConsola();
    }

    //Método de ejecución
    public void run() {
    	
        Bebida bebida = null;

        vista.mostrarInformacion("=== Bienvenido a la Cafetería ===");
        vista.mostrarInformacion("1. Café");
        vista.mostrarInformacion("2. Té");

        int tipo = vista.leerDatoEntero("Seleccione su bebida: ");
        if (tipo == 1) {
            bebida = new Cafe();
        } else if (tipo == 2) {
            bebida = new Te();
        } else {
            vista.mostrarInformacion(null);
            return;
        }

        int op;
        do {
            vista.mostrarInformacion("\nSeleccione un ingrediente para añadir:");
            vista.mostrarInformacion("1. Leche (+$500)");
            vista.mostrarInformacion("2. Canela (+$400)");
            vista.mostrarInformacion("0. Terminar y mostrar orden");

            op = vista.leerDatoEntero("Opción: ");
            switch (op) {
                case 1: bebida = new ConLeche(bebida); break;
                case 2: bebida = new ConCanela(bebida); break;
                case 0: break;
                default: vista.mostrarInformacion(null);
            }

        } while (op != 0);

        vista.mostrarInformacion("\nSu bebida: " + bebida.getDescripcion());
        vista.mostrarInformacion("Total: $" + bebida.getCosto());
	    }
}

