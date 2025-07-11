package co.edu.udistrital.controller;

import co.edu.udistrital.model.ChatMediator;
import co.edu.udistrital.model.ChatSala;
import co.edu.udistrital.model.UsuarioConcreto;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	    private ChatMediator sala;
	    private VistaConsola vista;

	    public Controller() {
	        sala = new ChatSala();
	        vista = new VistaConsola();
	    }

	    public void run() {
	        vista.mostrarInformacion("===== Bienvenido a la Sala de Chat =====");

	        // Crear 3 usuarios
	        UsuarioConcreto u1 = new UsuarioConcreto(sala, "Ana");
	        UsuarioConcreto u2 = new UsuarioConcreto(sala, "Luis");
	        UsuarioConcreto u3 = new UsuarioConcreto(sala, "Carlos");

	        sala.agregarUsuario(u1);
	        sala.agregarUsuario(u2);
	        sala.agregarUsuario(u3);

	        // Crear usuario principal desde consola
	        String nombre = vista.leerCadena("Ingrese su nombre");
	        UsuarioConcreto actual = new UsuarioConcreto(sala, nombre);
	        sala.agregarUsuario(actual);

	        String mensaje;
	        do {
	            mensaje = vista.leerCadena("Ingrese su mensaje");
	            if (!mensaje.equalsIgnoreCase("salir")) {
	                actual.enviar(mensaje);
	            }
	        } while (!mensaje.equalsIgnoreCase("salir"));

	        vista.mostrarInformacion("Chat finalizado.");
	    }
	


}
