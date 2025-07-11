package co.edu.udistrital.controller;

import co.edu.udistrital.model.ProcesadorPedido;
import co.edu.udistrital.model.Rappi;
import co.edu.udistrital.model.RappiAdapter;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;
	private ProcesadorPedido procesadorPedido;
	
	//Constructor
	public Controller() {
		vista = new VistaConsola();
		procesadorPedido = new RappiAdapter(new Rappi());
	}
	
	//Método de ejecución
	public void run() {
		String pedido = null;
		String mensaje = null;
		
		pedido = vista.leerCadena("Ingrese su pedido");
		mensaje =procesadorPedido.enviarPedido(pedido);
		vista.mostrarInformacion(mensaje);
		vista.mostrarInformacion("Pedido enviado a rappi");
		
		
	}

}
