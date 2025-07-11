package co.edu.udistrital.controller;


import co.edu.udistrital.model.Archivo;
import co.edu.udistrital.model.Carpeta;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	
	private VistaConsola vista;
	private Carpeta carpetaRaiz;
	private Carpeta carpetaActual;


	
	public Controller() {
		vista = new VistaConsola();
		carpetaRaiz = new Carpeta("Raiz");
		carpetaActual = carpetaRaiz;

	}
	
	//Método de ejecución
	public void run() {
		int op = 0;
		String resultado = null;
		
		
        do{
            op=menu();
            
    
            switch(op){
            
            	
                case 1:
                	vista.mostrarInformacion(carpetaActual.mostrar(" "));
  
                    break;
                case 2:
                	resultado = vista.leerCadena("Nombre del archivo: ");
                	carpetaActual.agregar(new Archivo(resultado));
                    break;
                case 3:
                	resultado = vista.leerCadena("Nombre de la subcarpeta: ");
                	carpetaActual.agregar(new Carpeta(resultado));
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
        		+"	\n Carpeta actual: "+ carpetaActual.getNombre()+"\n"
                + "1.  	VER CONTENIDO. \n"
                + "2.   AGREGAR ARCHIVO. \n"
                + "3.   AGREGAR SUBCARPETA. \n"
                + "4. 	SALIR\n"
                + "Seleccione una opción\n";
        return vista.leerDatoEntero(menu2);
		
	
	} 

		
}


