package co.edu.udistrital.controller;

import co.edu.udistrital.model.fabricaAbstracta.ServicioFactory;
import co.edu.udistrital.model.fabricaAbstracta.ServicioRutina;
import co.edu.udistrital.model.frabricaConcreta.PrimeraConcreto;
import co.edu.udistrital.model.frabricaConcreta.SegundaConcreto;
import co.edu.udistrital.model.frabricaConcreta.TerceraConcreto;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;
	
	public Controller() {
		vista = new VistaConsola();
	}
	
	public void run() {
		int op = 0;
        do{
            op=menu();
            switch(op){
                case 1:
                    semana(new PrimeraConcreto());
                    break;
                case 2:
                	semana(new SegundaConcreto());
                    break;
                case 3:
                	semana(new TerceraConcreto());
                    break;
                case 4:
                	vista.mostrarInformacion("Cerrando Programa");
                    System.exit(0);
                 default :
                	 vista.mostrarInformacion(".....Opcion invalida....");
            }
            vista.mostrarInformacion("");
        }while(op!=4);
    }
    
    public void semana(ServicioFactory Rutina){
        ServicioRutina servicio = Rutina.crearRutina();
        vista.mostrarInformacion(servicio.validarobjetivo());  
        vista.mostrarInformacion(servicio.validarPeso());
 
        
    }
    
    public int  menu(){
        String menu2 = 
                "MENU DE OPCIONES\n"
                + "1.   Solicitar Rutina primera semana. \n"
                + "2.   Solicitar Rutina Segunda semana. \n"
                + "3.   Solicitar Rutina Tercera semana. \n"
                + "4.   Cerrar programa. \n\n"
                + "Seleccion opcion...";
        return vista.leerDatoEntero(menu2);
		
	}

}
