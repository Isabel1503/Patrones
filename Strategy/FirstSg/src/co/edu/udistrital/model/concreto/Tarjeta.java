package co.edu.udistrital.model.concreto;

import co.edu.udistrital.model.MetodoPago;

public class Tarjeta implements MetodoPago{

	//Método que se necarga del pago via efectivo
	@Override
	public String cancelar(double monto) {
		
		return"Pago exitoso por valor de:  "+ monto + " \nMétodo de pago: tarjeta de crédito";
		
	}

}
