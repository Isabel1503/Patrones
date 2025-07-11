package co.edu.udistrital.model.concreto;

import co.edu.udistrital.model.Descuento;

public class Diamante implements Descuento {

	//Método que aplica 0.5 de descuento al producto
	@Override
	public double Descontar(double monto) {
		// TODO Auto-generated method stub
		return monto * 0.5;
	}
	
	

}
