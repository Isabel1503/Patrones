package co.edu.udistrital.model.concreto;

import co.edu.udistrital.model.Bebida;

public class Te extends Bebida{

	//Método que permite agrgar el té
	@Override
	protected Object agregarIngrediente() {
		return "Agregando té\n";
	}

	
	

}
