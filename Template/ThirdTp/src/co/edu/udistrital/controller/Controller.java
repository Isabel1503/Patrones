package co.edu.udistrital.controller;



import co.edu.udistrital.model.ProDocumento;
import co.edu.udistrital.model.concreto.Pdf;
import co.edu.udistrital.model.concreto.PowerPoint;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;
	
	public Controller() {
		vista = new VistaConsola();
	}
	//Método en el cual se captura la opción del menú y se procesa el documento 
	public void run() {
		int op = 0;
        do{
            op=menu();
            ProDocumento proDocumento = null;
            switch(op){
                case 1:
                	proDocumento = new Pdf();
                    break;
                case 2:
                	proDocumento = new PowerPoint();
                    break;
                case 3:
                	vista.mostrarInformacion("Cerrando Programa");
                    System.exit(0);
                 default :
                	 vista.mostrarInformacion(".....Opcion invalida....");
            }
            
            if ( proDocumento != null) {
            	String resultado = proDocumento.procesar();
            	vista.mostrarInformacion(resultado);
            }
            vista.mostrarInformacion("");
        }while(op!=3);
		
	}
	
	// Este método devuelve un int dependiendo de la opción que escoja el user
	public int  menu(){
        String menu2 = 
                "MENU DE OPCIONES\n"
                + "1.   PDF. \n"
                + "2.   POWERPOINT. \n"
                + "3.   Salir. \n"
                + "Seleccione una marca...";
        return vista.leerDatoEntero(menu2);
		
	}

}
