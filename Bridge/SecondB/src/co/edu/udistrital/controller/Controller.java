package co.edu.udistrital.controller;

import co.edu.udistrital.model.CuentaCorriente;
import co.edu.udistrital.model.CuentaDigital;
import co.edu.udistrital.model.TransaccionPago;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;
	private TransaccionPago transaccionpago;
	
	public Controller() {
		vista = new VistaConsola();
	}
	
	public void run() {
		int op = 0;
		String monto = null;
		do {
			op = menu();
			switch(op){
				case 1: 
					/*Aqui se crea un nuevo objeto Transaccion que hace uso de 
					 de la implementación concreta CuentaCorriente(), aqui se ve el uso del patron 
					 bridge conectando la abstracción con la emplimentación */
					transaccionpago = new TransaccionPago(new CuentaCorriente());
					monto = vista.leerCadenaTexto("Ingrese el monto de dinero que desea pagar");
					transaccionpago.enviarD(monto);
					break;
				case 2:
					transaccionpago = new TransaccionPago(new CuentaDigital());
					monto = vista.leerCadenaTexto("Ingrese el monto que desea pagar");
					transaccionpago.enviarD(monto);
					break;
				case 3:
	            	vista.mostrarInformacion("Cerrando Programa");
	            	System.exit(0);
	             default :
	            	 vista.mostrarInformacion(".....Opcion invalida....");
			}
			
		}while(op!=3);
	}
	
	public int menu() {
		String menu2 = 
			"MENU DE OPCIONES\n"
	                + "1.   Enviar pago mediante cuenta corriente. \n"
	                + "2.   Enviar pago mediante cuenta digital. \n"
	                + "3.   Cerrar programa. \n\n"
	                + "Seleccion opcion...";
		return vista.leerDatoEntero(menu2);
			
	}

}
