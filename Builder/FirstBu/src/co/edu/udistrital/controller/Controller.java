package co.edu.udistrital.controller;

import co.edu.udistrital.model.Celular;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;
	
	//Constructor
	public Controller() {
		vista =new VistaConsola();
	}
	
	//Método de ejecución
	public void run() {
		int a= 0, c = 0, e = 0, f = 0;
		String b= "0", d="0", g="0";
		vista.mostrarInformacion("Ingrese los datos del Celular");
		a = vista.leerDatoEntero("Digite el id: ");
		b = vista.leerCadena("Digite la marca: ");
		c = vista.leerDatoEntero("Digite la referencia: ");
		d = vista.leerCadena("Tiene sistema nfc: ");
		e = vista.leerDatoEntero("Digite el almacenamiento: ");
		f = vista.leerDatoEntero("Digite la resolución de la cámara: ");
		g = vista.leerCadena("Digite el sistema operativo: ");
		
		Celular celular = Celular.builder(a)
		        .marca(b)
		        .referencia(c)
		        .nfc(d)
		        .almacenamiento(e)
		        .ResolucionCa(f)
		        .OS(g)
		        .build();

		
		vista.mostrarInformacion("El celular posee las siguientes caracteristicas:\n"
		        + "\tID: " + celular.getId() + "\n"
		        + "\tMarca: " + celular.getMarca() + "\n"
		        + "\tReferencia: " + celular.getReferencia() + "\n"
		        + "\tNFC: " + celular.getNfs() + "\n"
		        + "\tAlmacenamiento: " + celular.getAlmacenamiento() + " GB\n"
		        + "\tResolución de la cámara: " + celular.getResolucionCa() + " MP\n"
		        + "\tSistema operativo: " + celular.getOS());

	
	}
	
	
	

}
