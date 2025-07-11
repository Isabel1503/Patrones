package co.edu.udistrital.controller;



import co.edu.udistrital.model.Boton;
import co.edu.udistrital.model.Pedido;
import co.edu.udistrital.model.Proceso;
import co.edu.udistrital.model.concreto.CancelarPedido;
import co.edu.udistrital.model.concreto.PagarPedido;
import co.edu.udistrital.model.concreto.RealizarPedido;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;
	private Proceso proceso;
	private Pedido pedido;
	private Boton boton;

	
	public Controller(){
		vista = new VistaConsola();
		pedido = new Pedido();
		boton = new Boton();

		
		
	}
	
	//Método de ejecución 
	public void run() {
	    int op = menu();

	    switch (op) {
	        case 1:
	            proceso = new RealizarPedido(pedido);
	            boton.setBoton(proceso);
	            vista.mostrarInformacion(boton.presionar());
	            break;
	        case 2:
	            proceso = new CancelarPedido(pedido);
	            boton.setBoton(proceso);
	            vista.mostrarInformacion(boton.presionar());
	            break;
	        case 3:
	            proceso = new PagarPedido(pedido);
	            boton.setBoton(proceso);
	            vista.mostrarInformacion(boton.presionar());
	            break;
	        case 4:
	            vista.mostrarInformacion("Cerrando Programa");
	            System.exit(0);
	            break;
	        default:
	            vista.mostrarInformacion(".....Opción inválida....");
	            break;
	    }

	}

		
		// Este método devuelve un int dependiendo de la opción que escoja el user
		public int  menu(){
	        String menu2 = 
	                "MENU DE OPCIONES\n"
	                + "1.   REALIZAR PEDIDO \n"
	                + "2.   CANCELAR PEDIDO. \n"
	                + "3.   PAGAR PEDIDO. \n"
	                + "4. 	SALIR. \n"
	                + "Seleccione un movimiento...\n";
	        return vista.leerDatoEntero(menu2);
			
		
		} 

	

}
