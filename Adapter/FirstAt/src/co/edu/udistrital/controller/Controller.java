package co.edu.udistrital.controller;

import co.edu.udistrital.model.AdaptadorServicioN;
import co.edu.udistrital.model.Guardador;
import co.edu.udistrital.model.ServicioNube;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;
	private Guardador guardador;
	
	//Constructor
	public Controller() {
		vista =new VistaConsola();
		guardador = new AdaptadorServicioN(new ServicioNube());
	}
	
	//Método de ejecución
	public void run() {
		String nombre = null;
		String mensaje = null;
		
		nombre= vista.leerCadena("Ingrese su nombre");
		mensaje = guardador.guardar("Nombre: " + nombre);
		vista.mostrarInformacion("El nombre se guardo con exito\n" + mensaje);
		
	}

}
