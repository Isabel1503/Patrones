package co.edu.udistrital.model;

public abstract class ComidaRapidaDecorator implements ComidaRapida{
	
	//Decorador que contiene una referencia a otra comida Rápida
	protected ComidaRapida comidaR;
	
	public ComidaRapidaDecorator(ComidaRapida comidaR) {
		this.comidaR = comidaR;
		
	}

}
