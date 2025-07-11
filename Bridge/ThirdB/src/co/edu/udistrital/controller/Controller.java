package co.edu.udistrital.controller;

import co.edu.udistrital.model.MeetPlataforma;
import co.edu.udistrital.model.ReunionModelos;
import co.edu.udistrital.model.TeamsPlataforma;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;
	private ReunionModelos reunionmodelos;
	
	public Controller() {
		vista = new VistaConsola();
	}
	
	public void run() {
		int op = 0;
		String horario = null;
		do {
			op = menu();
			switch(op){
			case 1:
				reunionmodelos = new ReunionModelos(new MeetPlataforma());
				horario = vista.leerCadenaTexto("Ingrese la fecha de la clase");
				reunionmodelos.Programar(horario);
				break;
				
			case 2:
				reunionmodelos = new ReunionModelos(new TeamsPlataforma());
				horario = vista.leerCadenaTexto("Ingrese el horario de la clase");
				reunionmodelos.Programar(horario);
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
		                + "1.   Programar la clase de modelos via Meet. \n"
		                + "2.   Programar la clase de modelos via Teams. \n"
		                + "3.   Cerrar programa. \n\n"
		                + "Seleccion opcion...";
			return vista.leerDatoEntero(menu2);
				
				
	}

}
