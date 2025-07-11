package co.edu.udistrital.controller;

import co.edu.udistrital.model.emailCanalCom;
import co.edu.udistrital.model.notificacionAlerta;
import co.edu.udistrital.model.smsCanalCom;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;
	private notificacionAlerta notificacionalerta;
	
	public Controller() {
		vista = new VistaConsola();
		
		}
	public void run() {
		int op = 0;
		String message = null;
		do {
			op=menu();
			switch(op) {
			case 1:
				notificacionalerta = new notificacionAlerta(new emailCanalCom());
				message = vista.leerCadenaTexto("Ingrese el mensaje");
				notificacionalerta.enviar(message);
				break;
			case 2:
				message = vista.leerCadenaTexto("Ingrese el mensaje");
				notificacionalerta = new notificacionAlerta(new smsCanalCom());
				notificacionalerta.enviar(message);
				break;
			case 3:
            	vista.mostrarInformacion("Cerrando Programa");
            	System.exit(0);
             default :
            	 vista.mostrarInformacion(".....Opcion invalida....");
			}
			vista.mostrarInformacion("");
		}while(op!=3);
		
		
	}
	
	public int menu() {
		String menu2 =
				"MENU DE OPCIONES\n"
		                + "1.   Enviar el mensaje de alerta via email. \n"
		                + "2.   Enviar el mensaje de alerta via sms. \n"
		                + "3.   Cerrar programa. \n\n"
		                + "Seleccion opcion...";
		        return vista.leerDatoEntero(menu2);
	}

}
