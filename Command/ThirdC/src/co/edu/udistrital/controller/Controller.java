package co.edu.udistrital.controller;

import co.edu.udistrital.model.ApagarRadio;
import co.edu.udistrital.model.Comando;
import co.edu.udistrital.model.ControlRemoto;
import co.edu.udistrital.model.EncenderTv;
import co.edu.udistrital.model.Radio;
import co.edu.udistrital.model.Televisor;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	
	private VistaConsola vista;
	private ControlRemoto control;
	private Televisor tv;
	private Comando encenderTv;
	private Radio radio;
	private Comando apagarRadio;
	
	public Controller() {
		vista = new VistaConsola();
		control = new ControlRemoto();
		tv = new Televisor();
		radio = new Radio();
		//Comandos
		encenderTv = new EncenderTv(tv);
		apagarRadio = new ApagarRadio(radio);
	}
	
	//Método de ejcución
	public void run() {
		int op = 0;
		String resultado = null;
		
		
        do{
            op=menu();
            
    
            switch(op){
            
            	
                case 1:
                	 control.setComando(encenderTv);//Que acción hacer
                	 resultado = control.presionarBoton();//   Como hacerla   
                	 vista.mostrarInformacion(resultado);
                    break;
                case 2:
                	control.setComando(apagarRadio);
                	resultado =control.presionarBoton();  
                	vista.mostrarInformacion(resultado);
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
                + "1.   ENCENDER TELEVISOR. \n"
                + "2.   APAGAR RADIO. \n"
                + "3.   SALIR. \n"
                + "Seleccione una opción...\n";
        return vista.leerDatoEntero(menu2);
		
	
	} 

		
}


