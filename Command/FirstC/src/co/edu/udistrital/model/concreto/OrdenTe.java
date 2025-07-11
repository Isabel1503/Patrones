package co.edu.udistrital.model.concreto;

import co.edu.udistrital.model.Cocinero;
import co.edu.udistrital.model.Orden;

public class OrdenTe implements Orden{
	Cocinero cocinero;
	
	//Recibe al cocinero para realizar la preparación
	
	public OrdenTe(Cocinero cocinero) {
		this.cocinero = cocinero;
	}

	@Override
	public String ejecutar() {
		return cocinero.prepararTe();
		
	}

	
}
