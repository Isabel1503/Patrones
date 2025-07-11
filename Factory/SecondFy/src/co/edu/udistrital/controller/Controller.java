package co.edu.udistrital.controller;

import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;
	
	public Controller() {
		vista = new VistaConsola();
	}
	public void run() {
		String s;
		
		vista.mostrarInformacion("Ingresa el tipo de cafe a ordenar");
		
		s = vista.leerCadenaTexto("\t"+ "Digite el tipo de cafe: Mocca, Latte, Cappuccino o Americano");
		
		
	}

}
