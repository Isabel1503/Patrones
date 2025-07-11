package co.edu.udistrital.controller;

import co.edu.udistrital.model.Snack;
import co.edu.udistrital.model.Bunuelo;
import co.edu.udistrital.model.ConArequipe;
import co.edu.udistrital.model.ConChocolate;
import co.edu.udistrital.model.Dona;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;

    public Controller() {
        vista = new VistaConsola();
    }

  //Método de ejecución
    public void run() {
    	
        Snack snack = null;

        vista.mostrarInformacion("=== Bienvenido a la Panaderia ===");
        vista.mostrarInformacion("1. Buñuelo");
        vista.mostrarInformacion("2. Dona");

        int tipo = vista.leerDatoEntero("Seleccione su snack: ");
        if (tipo == 1) {
            snack = new Bunuelo();
        } else if (tipo == 2) {
        	snack = new Dona();
        } else {
            vista.mostrarInformacion(null);
            return;
        }

        int op;
        do {
            vista.mostrarInformacion("\nSeleccione un ingrediente para añadir:");
            vista.mostrarInformacion("1. Chocolate (+$500)");
            vista.mostrarInformacion("2. Arequipe(+$400)");
            vista.mostrarInformacion("0. Terminar y mostrar orden");

            op = vista.leerDatoEntero("Opción: ");
            switch (op) {
                case 1: snack = new ConChocolate(snack); break;
                case 2: snack = new ConArequipe(snack); break;
                case 0: break;
                default: vista.mostrarInformacion(null);
            }

        } while (op != 0);

        vista.mostrarInformacion("\nSu Snack: " + snack.getDescripcion());
        vista.mostrarInformacion("Total: $" + snack.getCosto());
	    }
}

