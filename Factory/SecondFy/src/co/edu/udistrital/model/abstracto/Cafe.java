package co.edu.udistrital.model.abstracto;

public abstract class Cafe {
	
	protected char Nombre;
	protected double Precio;
	
	public Cafe(char tipo, double precio) {
		this.Nombre = tipo;
		this.Precio = precio;
		
	}
	public abstract String describir();
	

}
