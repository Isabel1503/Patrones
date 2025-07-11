package co.edu.udistrital.model.concreto;

import co.edu.udistrital.model.Pedido;
import co.edu.udistrital.model.Proceso;

public class RealizarPedido implements Proceso{
	
	private Pedido pedido;
	
	//Recibe al pedido para realizarlo
	public RealizarPedido(Pedido pedido) {
		this.pedido = pedido;
		
	}

	@Override
	public String ejecutar() {
		return pedido.realizar();
	}

}
