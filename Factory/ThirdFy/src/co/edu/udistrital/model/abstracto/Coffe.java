package co.edu.udistrital.model.abstracto;

public abstract class Coffe {
	protected String Tipo;
	protected int Cantidad;
	
	public Coffe(String tipo, int cantidad) {
		this.Tipo = tipo;
		this.Cantidad = cantidad;
	}
	
	public abstract String describir();
	public abstract String calcularPrecio();

}
