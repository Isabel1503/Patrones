package co.edu.udistrital.controller;


import co.edu.udistrital.model.Carro;
import co.edu.udistrital.model.concreto.Bmw;
import co.edu.udistrital.model.concreto.Volkswagen;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;
	
	public Controller() {
		vista = new VistaConsola();
	}
	//Método en el cual se captura la opción del menú y se crea el carro especifico
	public void run() {
		int op = 0;
        do{
            op=menu();
            Carro carro = null;
            switch(op){
                case 1:
                	carro = new Bmw();
                    break;
                case 2:
                	carro = new Volkswagen();
                    break;
                case 3:
                	vista.mostrarInformacion("Cerrando Programa");
                    System.exit(0);
                 default :
                	 vista.mostrarInformacion(".....Opcion invalida....");
            }
            
            if ( carro != null) {
            	String resultado = carro.Construir();
            	vista.mostrarInformacion(resultado);
            }
            vista.mostrarInformacion("");
        }while(op!=3);
		
	}
	
	// Este método devuelve un int dependiendo de la opción que escoja el user
	public int  menu(){
        String menu2 = 
                "MENU DE OPCIONES\n"
                + "1.   BMW. \n"
                + "2.   VOLSWAGEN. \n"
                + "3.   Salir. \n"
                + "Seleccione una marca...";
        return vista.leerDatoEntero(menu2);
		
	}

}
