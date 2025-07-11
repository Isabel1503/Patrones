package co.edu.udistrital.controller;

import co.ed.udistrital.model.ConcretoCreador.CoffeCreador;
import co.edu.udistrital.model.abstracto.Coffe;
import co.edu.udistrital.model.abstracto.CoffeFactory;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	
	private VistaConsola vista;
	
	public Controller() {
		vista = new VistaConsola();
	}
	
	public void run() {
		String a = "0";
		int b = 0;
		String[] coffeOffer= {"Americano","Cappuccino","Latte"};
		
		vista.mostrarInformacion("DATOS DE LA ORDEN");
		for (String p : coffeOffer) {
            vista.mostrarInformacion("- " + p);
        }
        boolean coffeAvailable = false;
        while (!coffeAvailable) {
            a = vista.leerCadenaTexto("\t" + "Digite el tipo de cafe a ordenar: ");

            for (String p : coffeOffer) {
                if (a.equalsIgnoreCase(p)) {
                    a = p;
                    coffeAvailable = true;
                    break;
                }
            }

            if (!coffeAvailable) {
                vista.mostrarInformacion("Cafe no disponible");
            }
        }
		
		b =vista.leerDatoEntero("\n" + "Digite la totalidad de cafes a ordenar: ");
		
		CoffeFactory fabrica = new CoffeCreador();
		Coffe coffe = fabrica.CrearOrden(a, b);
		
		vista.mostrarInformacion("EL CAFE SELECCIONADO FUE: " +coffe.describir());
		vista.mostrarInformacion("El precio total es de: " +coffe.calcularPrecio());
	}
}
