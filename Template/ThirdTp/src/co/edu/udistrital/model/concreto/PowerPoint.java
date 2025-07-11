package co.edu.udistrital.model.concreto;

import co.edu.udistrital.model.ProDocumento;

public class PowerPoint extends ProDocumento{

	@Override
	protected Object procesarContenido() {
		// TODO Auto-generated method stub
		return "Procesando PowerPoint con Office\n";
	}

}
