package co.edu.udistrital.controller;

import co.edu.udistrital.model.Iterador;
import co.edu.udistrital.model.ListaProductos;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	    private ListaProductos lista;
	    private VistaConsola vista;
	    
	    public Controller() {
	    	String[] nombres = {"Jugo", "Pasta", "Chocolate", "Papas"};
	    	lista = new ListaProductos(nombres);
	    	vista = new VistaConsola();
	    }



	    public void run() {
	        Iterador iterador = lista.crearIterador();
	

	        while (iterador.hasNext()) {
	            vista.esperarEnter("Presione enter para ver el siguiente Producto");
	            String nombre = iterador.next();
	            vista.mostrarInformacion(nombre);
	        }

	        vista.mostrarInformacion("Fin de la lista.");
	     
	    }
	}



