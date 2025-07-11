package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Coffe;

public class Cappuccino extends Coffe{

	public Cappuccino(String a, int b) {
		super(a, b);
	}

	@Override
	public String describir() {
		return " CAPPUCCINO ";

	}

	@Override
	public String calcularPrecio() {
		int x;
		String res;
		x = (3000 * Cantidad);
		res = Integer.toString(x);
		return res;
	}
	

}
