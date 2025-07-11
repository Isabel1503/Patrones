package co.edu.udistrital.model.concreto;

import co.edu.udistrital.model.Pedido;
import co.edu.udistrital.model.Proceso;

public class CancelarPedido implements Proceso{
	private Pedido pedido;
	
	//Recibe al pedido para cancelarlo
	public CancelarPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public String ejecutar() {
		// TODO Auto-generated method stub
		return pedido.Cancelar();
	}

}
