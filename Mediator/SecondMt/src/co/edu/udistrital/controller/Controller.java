package co.edu.udistrital.controller;

import co.edu.udistrital.model.ForoMediator;
import co.edu.udistrital.model.ForoPlataforma;
import co.edu.udistrital.model.UsuarioConcreto;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	    private ForoMediator foro;
	    private VistaConsola vista;

	    public Controller() {
	    	foro = new ForoPlataforma();
	        vista = new VistaConsola();
	    }

	    public void run() {
	        vista.mostrarInformacion("===== Bienvenido a la Sala de Chat =====");

	        // Crear 3 usuarios
	        UsuarioConcreto u1 = new UsuarioConcreto(foro, "Estudiante 1");
	        UsuarioConcreto u2 = new UsuarioConcreto(foro, "Estudiante 2");
	        UsuarioConcreto u3 = new UsuarioConcreto(foro, "Estudiante 3");

	        foro.agregarUsuario(u1);
	        foro.agregarUsuario(u2);
	        foro.agregarUsuario(u3);

	        // Crear usuario principal desde consola
	        String nombre = vista.leerCadena("Nombre del docente");
	        UsuarioConcreto actual = new UsuarioConcreto(foro, nombre);
	        foro.agregarUsuario(actual);

	        String mensaje;
	        do {
	            mensaje = vista.leerCadena("Ingrese el enunciado en el foro");
	            if (!mensaje.equalsIgnoreCase("salir")) {
	                actual.enviar(mensaje);
	            }
	        } while (!mensaje.equalsIgnoreCase("salir"));

	        vista.mostrarInformacion("Chat finalizado.");
	    }
	


}
