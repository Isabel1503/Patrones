package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Coffe;

public class Americano extends Coffe{

	public Americano(String a, int b) {
		super(a, b);
	}

	@Override
	public String describir() {
		
		return " AMERICANO ";
	}

	@Override
	public String calcularPrecio() {
		int x;
		String res;
		x = (2000 * Cantidad);
		res = Integer.toString(x);
		return res;
	}



}
