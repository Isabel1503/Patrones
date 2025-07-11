package co.edu.udistrital.controller;

import co.edu.udistrital.model.Empleado;
import co.edu.udistrital.model.Jefe;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	
	private VistaConsola vista;
	private Jefe jefeGeneral;
	
	public Controller() {
		vista = new VistaConsola();
	}
	
	//Método de ejecución
	public void run() {
		
		String nombre = vista.leerCadena("Ingrese el nombre del jefe general: ");
        jefeGeneral = new Jefe(nombre);
		int op = 0;
		
		
        do{
            op=menu();
            
    
            switch(op){
            
            	
                case 1:
                	String nomEmp = vista.leerCadena("Nombre del empleado:" );
                	jefeGeneral.agregar(new Empleado(nomEmp));
  
                    break;
                case 2:
                	String nomJefe = vista.leerCadena("Nombre del nuevo jefe: ");
                    jefeGeneral.agregar(new Jefe(nomJefe));
                    break;
                case 3:
                	vista.mostrarInformacion("Organigrama: \n");
                    vista.mostrarInformacion(jefeGeneral.mostrar(""));
                	break;
                case 4:
                	vista.mostrarInformacion("Cerrando Programa");
                    System.exit(0);
                 default :
                	 vista.mostrarInformacion(".....Opcion invalida....");
            }
           
        }while(op!=4);
		
	}
	
	// Este método devuelve un int dependiendo de la opción que escoja el user
	public int  menu(){
        String menu2 = 
                "MENU DE OPCIONES\n"
        		+"	\n Carpeta actual: "+ jefeGeneral.getNombre()+"\n"
                + "1.  	AGREGAR EMPLEADO. \n"
                + "2.   AGREGAR JEFE SUBORDINADO \n"
                + "3.   VER ESTRUCTUA COMPLETA. \n"
                + "4. 	SALIR\n"
                + "Seleccione una opción\n";
        return vista.leerDatoEntero(menu2);
		
	
	} 

		
}


