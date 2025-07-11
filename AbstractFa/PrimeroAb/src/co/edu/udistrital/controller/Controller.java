package co.edu.udistrital.controller;

import co.edu.udistrital.model.fabricaAbstracta.ServicioFactory;
import co.edu.udistrital.model.fabricaAbstracta.ServicioGanancia;
import co.edu.udistrital.model.fabricaConcreta.AnualConcreto;
import co.edu.udistrital.model.fabricaConcreta.MensualConcreto;
import co.edu.udistrital.model.fabricaConcreta.SemestralConcreto;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;
	
	public Controller() {
		vista = new VistaConsola();
	}
	
	public void run() {
		int op = 0;
		do {
			op=menu();
			switch(op) {
			case 1:
				periodo(new MensualConcreto());
				break;
			case 2:
				periodo(new SemestralConcreto());
				break;
			case 3:
				periodo(new AnualConcreto());
				break;
			case 4:
				vista.mostrarInformacion("Cerrando programa");
				System.exit(0);
			default:
				vista.mostrarInformacion("Opción invalida");
		}
		vista.mostrarInformacion("");
			
		}while(op!=4);
	}
	public void periodo(ServicioFactory Ganancia) {
		ServicioGanancia servicio = Ganancia.crearGanancia();
		vista.mostrarInformacion(servicio.validarIngresos());
		vista.mostrarInformacion(servicio.validarGastos());
		
	}
	
	public int menu(){
		String menu2 = 
				"MENU DE OPCIONES\n"
				+"1. Solicitar Ganancia mensual. \n"
				+"2. Solicitar Ganancia Semestral. \n"
				+"3. Solicitar Ganancia anual. \n"
				+"4. Cerrar programa \n\n"
				+"Selección opcion";
		return vista.leerDatoEntero(menu2);
		
	}
	

}
