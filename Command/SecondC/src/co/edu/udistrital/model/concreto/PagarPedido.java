package co.edu.udistrital.model.concreto;

import co.edu.udistrital.model.Pedido;
import co.edu.udistrital.model.Proceso;

public class PagarPedido implements Proceso{
	
	private Pedido pedido;
	
	//Recibe al pedido para ejectuar el pago
	public PagarPedido(Pedido pedido) {
		
		this.pedido = pedido;
	}
	

	@Override
	public String ejecutar() {
		// TODO Auto-generated method stub
		return pedido.pagar();
	}

}
