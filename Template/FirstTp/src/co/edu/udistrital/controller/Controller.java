package co.edu.udistrital.controller;

import co.edu.udistrital.model.Bebida;
import co.edu.udistrital.model.concreto.Cafe;
import co.edu.udistrital.model.concreto.Te;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;
	
	public Controller() {
		vista = new VistaConsola();
	}
	//Método en el cual se captura la opción del menú y se crea la bebida especifica
	public void run() {
		int op = 0;
        do{
            op=menu();
            Bebida bebida = null;
            switch(op){
                case 1:
                    bebida = new Cafe();
                    break;
                case 2:
                	bebida = new Te();
                    break;
                case 3:
                	vista.mostrarInformacion("Cerrando Programa");
                    System.exit(0);
                 default :
                	 vista.mostrarInformacion(".....Opcion invalida....");
            }
            
            if ( bebida != null) {
            	String resultado = bebida.preparar();
            	vista.mostrarInformacion(resultado);
            }
            vista.mostrarInformacion("");
        }while(op!=3);
		
	}
	
	// Este método devuelve un int dependiendo de la opción que escoja el user
	public int  menu(){
        String menu2 = 
                "MENU DE OPCIONES\n"
                + "1.   Café. \n"
                + "2.   Té. \n"
                + "3.   Salir. \n"
                + "Seleccione una bebida...";
        return vista.leerDatoEntero(menu2);
		
	}

}
