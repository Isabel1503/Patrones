package co.edu.udistrital.model;

public abstract class SnackDecorator implements Snack{
	
	//Decorador que contiene una referencia a otro snack
	protected Snack snack;
	
	public SnackDecorator(Snack snack) {
		this.snack = snack;
		
	}

}
