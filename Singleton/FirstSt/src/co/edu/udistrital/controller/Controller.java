package co.edu.udistrital.controller;

import co.edu.udistrital.model.CursoUnico;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	
	private VistaConsola vista;
	
	public Controller() {
		vista = new VistaConsola();
	}
	
	public void run() {
		
		CursoUnico obj = CursoUnico.getinstancia();
		CursoUnico otro = CursoUnico.getinstancia();
		obj.setPruebaInstancia("MODELOS DE PROGRAMACIÓN");
		vista.mostrarInformacion(otro.getPruebaInstancia());
		otro.setPruebaInstancia("INVESTIGACIÓN DE OPERACIONES");
		vista.mostrarInformacion(obj.getPruebaInstancia());
		
	}

}
