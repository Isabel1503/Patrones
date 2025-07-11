package co.edu.udistrital.model;

public abstract class BebidaDecorator implements Bebida{
	
	//Decorador que contiene una referencia a otra bebida
	protected Bebida bebida;
	
	public BebidaDecorator(Bebida bebida) {
		this.bebida = bebida;
		
	}

}
