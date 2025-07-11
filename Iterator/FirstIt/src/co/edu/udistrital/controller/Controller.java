package co.edu.udistrital.controller;

import co.edu.udistrital.model.Iterador;
import co.edu.udistrital.model.ListaNombres;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	    private ListaNombres lista;
	    private VistaConsola vista;
	    
	    public Controller() {
	    	String[] nombres = {"Ana", "Luis", "Carlos", "Marta"};
	    	lista = new ListaNombres(nombres);
	    	vista = new VistaConsola();
	    }



	    public void run() {
	        Iterador iterador = lista.crearIterador();
	

	        while (iterador.hasNext()) {
	            vista.esperarEnter("Presione enter para ver el siguiente nombre");
	            String nombre = iterador.next();
	            vista.mostrarInformacion(nombre);
	        }

	        vista.mostrarInformacion("Fin de la lista.");
	     
	    }
	}



