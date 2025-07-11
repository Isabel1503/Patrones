package co.edu.udistrital.controller;


import co.edu.udistrital.model.BotonOrden;
import co.edu.udistrital.model.Cocinero;
import co.edu.udistrital.model.Orden;
import co.edu.udistrital.model.concreto.OrdenCafe;
import co.edu.udistrital.model.concreto.OrdenTe;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;
	private Cocinero cocinero;
	private BotonOrden boton;
	private Orden orden;
	

	
	public Controller(){
		vista = new VistaConsola();
		cocinero = new Cocinero ();
		boton = new BotonOrden();
		
		
	}
	
	//Método de ejecución 
		public void run(){
			int op = 0;
			
			
	        do{
	            op=menu();
	    
	            switch(op){
	            
	            	
	                case 1:
	                	 orden = new OrdenCafe(cocinero);//Creación de comando
	                	 boton.setOrden(orden);//Asigna comando al invoker
	                	 vista.mostrarInformacion(boton.presionar());//Invoker ejecuta
	                	 
	                	 
	                    break;
	                case 2:
	                	orden = new OrdenTe(cocinero);
	                	boton.setOrden(orden);
	                	vista.mostrarInformacion(boton.presionar());
	                	 
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
	                + "1.   CAFÉ. \n"
	                + "2.   TÉ. \n"
	                + "3.   SALIR. \n"
	                + "Seleccione una bebida...\n";
	        return vista.leerDatoEntero(menu2);
			
		
		} 

	

}
