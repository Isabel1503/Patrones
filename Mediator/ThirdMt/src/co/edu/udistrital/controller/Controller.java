package co.edu.udistrital.controller;

import co.edu.udistrital.model.MuroMediator;
import co.edu.udistrital.model.MuroPlataforma;
import co.edu.udistrital.model.EditorConcreto;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	    private MuroMediator muro;
	    private VistaConsola vista;

	    public Controller() {
	    	muro = new MuroPlataforma();
	        vista = new VistaConsola();
	    }

	    public void run() {
	        vista.mostrarInformacion("===== Bienvenido a la Sala de Chat =====");

	        // Crear 3 usuarios
	        EditorConcreto u1 = new EditorConcreto(muro, "Editor 1");
	        EditorConcreto u2 = new EditorConcreto(muro, "Editor 2");
	        EditorConcreto u3 = new EditorConcreto(muro, "Editor 3");

	        muro.agregarEditor(u1);
	        muro.agregarEditor(u2);
	        muro.agregarEditor(u3);

	        // Crear editor principal desde consola
	        String nombre = vista.leerCadena("Nombre del Editor");
	        EditorConcreto actual = new EditorConcreto(muro, nombre);
	        muro.agregarEditor(actual);

	        String mensaje;
	        do {
	            mensaje = vista.leerCadena("Ingrese su texto en el foro");
	            if (!mensaje.equalsIgnoreCase("salir")) {
	                actual.enviar(mensaje);
	            }
	        } while (!mensaje.equalsIgnoreCase("salir"));

	        vista.mostrarInformacion("Chat finalizado.");
	    }
	


}
