package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Coffe;

public class Latte extends Coffe  {

	public Latte(String a, int b) {
		super(a, b);
	}

	@Override
	public String describir() {
		return " LATTE ";
	}

	@Override
	public String calcularPrecio() {
		int x;
		String res;
		x = (4000 * Cantidad);
		res = Integer.toString(x);
		return res;
	}

}
