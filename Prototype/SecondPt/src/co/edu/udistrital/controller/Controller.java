package co.edu.udistrital.controller;

import co.edu.udistrital.model.Registro;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	
	private VistaConsola vista;
	
	public Controller() {
		vista = new VistaConsola();
	}
	
	public void run() {
		Registro obj1= new Registro("Maria","maria@gmail.com");
		vista.mostrarInformacion("El registro inicial es " +obj1.getNom()+ " " +obj1.getCor());
		
		Registro obj2 = new Registro("Juan ","Juan@gmail.com");
		
		obj1 = obj2;
		
		obj1.setNom("Isabel");
		vista.mostrarInformacion("El correo del objeto 1 modificado es  ...." + obj1.getCor());
		vista.mostrarInformacion("El nombre del objeto dos modificado es ...." + obj2.getNom());
		vista.mostrarInformacion("El registro 1 final es:" +obj1.getNom()+" " +obj1.getCor());
		vista.mostrarInformacion("El registro 2 final es:" +obj2.getNom()+" " +obj2.getCor());
	}

}
