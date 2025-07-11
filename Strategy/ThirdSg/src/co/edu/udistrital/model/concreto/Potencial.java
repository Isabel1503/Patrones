package co.edu.udistrital.model.concreto;

import co.edu.udistrital.model.Descuento;

public class Potencial implements Descuento{

	//Método que no aplica descuento al producto
	@Override
	public double Descontar(double monto) {
		// TODO Auto-generated method stub
		return monto;
	}

}
