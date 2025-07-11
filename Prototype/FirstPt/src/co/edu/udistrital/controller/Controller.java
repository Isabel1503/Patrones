package co.edu.udistrital.controller;

import co.edu.udistrital.model.Factura;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	
	private VistaConsola vista;
	
	public Controller() {
		vista = new VistaConsola();
	}
	
	public void run() {
		Factura obj1= new Factura("Combo kfc 1", 32.900);
		vista.mostrarInformacion("La orden fue " +obj1.getNom()+"El precio fue" +obj1.getPre());
		
		Factura obj2 = new Factura("Combo kfc bigMac",38000);
		
		obj1 = obj2;
		vista.mostrarInformacion("La orden del objeto dos es : "+ obj2.getNom()+"y el precio es: "+obj2.getPre());
		
		obj1.setPre(85000);
		vista.mostrarInformacion("La orden es " + obj1.getNom() + " El precio es: "+obj1.getPre());
		vista.mostrarInformacion("La orden es " + obj2.getNom() +"El precio del objeto dos es:"+obj2.getPre());
		
		
		
		
		
	}
	

}
