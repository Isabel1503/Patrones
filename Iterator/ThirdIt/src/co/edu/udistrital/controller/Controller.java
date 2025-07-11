package co.edu.udistrital.controller;

import co.edu.udistrital.model.Iterador;
import co.edu.udistrital.model.ListaBebidas;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	    private ListaBebidas lista;
	    private VistaConsola vista;
	    
	    public Controller() {
	    	String[] nombres = {"Cafe", "Té", "Tinto", "Late"};
	    	lista = new ListaBebidas(nombres);
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



