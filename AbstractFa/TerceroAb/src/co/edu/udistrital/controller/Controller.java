package co.edu.udistrital.controller;

import co.edu.udistrital.model.fabricaAbstracta.ServicioFactory;
import co.edu.udistrital.model.fabricaAbstracta.ServicioPorcentaje;
import co.edu.udistrital.model.fabricaConcreta.AltaConcreto;
import co.edu.udistrital.model.fabricaConcreta.BajaConcreto;
import co.edu.udistrital.model.fabricaConcreta.MediaConcreto;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;
	
	public Controller(){
		vista = new VistaConsola();
	}
	
	public void run() {
		int op = 0;
		//int a= 0;
		do {
			op=menu();
			switch(op) {
			case 1:
				temporada(new BajaConcreto());
				break;
			case 2:
				temporada(new MediaConcreto());
				break;
			case 3: 
				temporada(new AltaConcreto());
				break;
			case 4:
				vista.mostrarInformacion("Cerrando programa");
				System.exit(0);
			default :
				vista.mostrarInformacion("Opción no valida");
			}
			vista.mostrarInformacion("");
		}while(op!=4);
		
	}
	public void temporada(ServicioFactory Porcentaje) {
		ServicioPorcentaje servicio = Porcentaje.crearPorcentaje();
		double ganancia = vista.leerDatoDouble("Ingrese el valor de la ganancia:");
		double total = servicio.validarGanancia(ganancia);
		vista.mostrarInformacion("El porcentaje de ganancia es: "+total);
		
	}
	public int menu(){
		String menu2 =
				"MENU DE OPCIONES. \n"
				+"1. TEMPORADA BAJA. \n"
				+"2. TEMPORADA MEDIA. \n"
				+"3. TEMPORADA ALTA. \n"
				+"4. SALIR. \n\n"
				+"SELECCION OPCIÓN ";
		return vista.leerDatoEntero(menu2);
	}
				
	

}
