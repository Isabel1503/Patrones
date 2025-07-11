package co.edu.udistrital.model;

public class Pedido {
	private String descripcion;
	
	public Pedido ( String descripcion) {
		this.descripcion = descripcion;
	}
	
	//Método que se encarga de mostrar el pedido
	@Override
	public String toString() {
		return "Pedido [descripcion=" + descripcion + "]";
	}
	
	

}
