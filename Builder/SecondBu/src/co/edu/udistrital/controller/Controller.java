package co.edu.udistrital.controller;

import co.edu.udistrital.model.Moto;
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
		String m= "0";
		String t = "0";
		int r = 0;
		int c = 0;
		vista.mostrarInformacion("Datos de la moto");
		i = vista.leerDatoEntero("Ingrese el id: ");
		m = vista.leerCadena("Ingrese la marca: ");
		t = vista.leerCadena("Ingrese el tipo: ");
		r = vista.leerDatoEntero("Ingrese la referencia: ");
		c = vista.leerDatoEntero("Ingrese el cilindraje: ");
		
		Moto moto= Moto.builder(i)
				.marca(m)
				.tipo(t)
				.referencia(r)
				.cilindraje(c)
				.build();
		
		vista.mostrarInformacion("Datos:\n"
				+"\tID: " + moto.getId() + "\n"
				+"\tTIPO: " + moto.getTipo() + "\n"
				+"\tMARCA: " + moto.getMarca() + "\n"
				+"\tREFERENCIA: " + moto.getReferencia() +"\n"
				+"\tCILINDRAJE: " + moto.getCilindraje() +"\n");
	}

}
