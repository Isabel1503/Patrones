package co.edu.udistrital.model.concreto;

import co.edu.udistrital.model.Cocinero;
import co.edu.udistrital.model.Orden;

public class OrdenCafe implements Orden{
	Cocinero cocinero;
	//Recibe al cocinero para realizar la preparación
	
	public OrdenCafe(Cocinero cocinero) {
		this.cocinero = cocinero;
	}

	@Override
	public String ejecutar() {
		return cocinero.prepararCafe();
		
	}

	
}
