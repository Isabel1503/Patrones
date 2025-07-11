package co.edu.udistrital.controller;

import co.edu.udistrital.model.Jugador;
import co.edu.udistrital.model.concreto.Caminar;
import co.edu.udistrital.model.concreto.Trotar;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;
	private Jugador jugador;
	
	public Controller(){
		vista = new VistaConsola();
		jugador = new Jugador();
		
	}
	
	//Método de ejecución 
	public void run(){
		int op = 0;
		String mensaje = null;
        do{
            op=menu();
    
            switch(op){
                case 1:
                	 jugador.setMovientoS(new Caminar());
                	 mensaje = jugador.mover();
                	 vista.mostrarInformacion(mensaje);
                    break;
                case 2:
                	jugador.setMovientoS(new Trotar());
                	mensaje = jugador.mover();
               	 	vista.mostrarInformacion(mensaje);
                    break;
                case 3:
                	vista.mostrarInformacion("Cerrando Programa");
                    System.exit(0);
                 default :
                	 vista.mostrarInformacion(".....Opcion invalida....");
            }
           
        }while(op!=3);
		
	}
	
	// Este método devuelve un int dependiendo de la opción que escoja el user
	public int  menu(){
        String menu2 = 
                "MENU DE OPCIONES\n"
                + "1.   CAMINAR. \n"
                + "2.   TROTAR. \n"
                + "3.   SALIR. \n"
                + "Seleccione un movimiento...\n";
        return vista.leerDatoEntero(menu2);
		
	
	} 

}
