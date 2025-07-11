package co.edu.udistrital.model;

public class RappiAdapter implements ProcesadorPedido{
	private  Rappi rappi ;
	
	//El constructor recibe una instancia de Rappi
	public RappiAdapter(Rappi rappi) {
		this.rappi = rappi;
	}

	
	@Override
	public String enviarPedido(String pedido) {

		//Adapta el metodo enviarPedido para usar RappienviarPedido
		return rappi.RappienviarPedido(pedido);
		
		
	}
	
	

}
