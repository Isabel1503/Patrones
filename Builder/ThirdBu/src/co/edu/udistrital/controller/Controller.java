package co.edu.udistrital.controller;


import co.edu.udistrital.model.Persona;
import co.edu.udistrital.view.VistaConsola;


public class Controller {
	private VistaConsola vista;
	
	//Constructor
	public Controller() {
		vista = new VistaConsola();
	}
	
	//Método de ejecución
	public void run() {
		int i= 0;
		String n= null;
		int d = 0;
		String c = null;
		vista.mostrarInformacion("Datos de la persona");
		i = vista.leerDatoEntero("Ingrese el id: ");
		n = vista.leerCadena("Ingrese el nombre: ");
		d = vista.leerDatoEntero("Ingrese el documento: ");
		c = vista.leerCadena("Ingrese el correo: ");
		
		Persona persona= Persona.builder(i)
				.nombre(n)
				.documento(d)
				.correo(c)
				.build();
		
		vista.mostrarInformacion("Datos:\n"
				+"\tID: " + persona.getId() + "\n"
				+"\tNOMBRE: " + persona.getNombre() + "\n"
				+"\tDOCUMENTO: " + persona.getDocumento() + "\n"
				+"\tCORREO: " + persona.getCorreo());
	}

}
