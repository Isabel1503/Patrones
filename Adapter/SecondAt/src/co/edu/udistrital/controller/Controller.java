package co.edu.udistrital.controller;

import co.edu.udistrital.model.AdaptadorXml;
import co.edu.udistrital.model.LibreriaJson;
import co.edu.udistrital.model.XmlAnalizador;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;
	private XmlAnalizador xmlAnalizador;
	
	public Controller() {
		vista = new VistaConsola();
		
		//Creación del adaptador, inyectando al adaptado
		xmlAnalizador = new AdaptadorXml(new LibreriaJson());
		}
	
	public void run() {
		String mensaje = null;
		String resultado = null;
		
		mensaje = vista.leerCadena("Ingrese su mensaje: ");
		
		//Se usa el adaptador como si fuera el XmlAnalizador
		resultado = xmlAnalizador.AnalizadorXml("{'mensaje': '" +mensaje + "'}" );
		
		vista.mostrarInformacion(resultado);
		
		
	}

}
