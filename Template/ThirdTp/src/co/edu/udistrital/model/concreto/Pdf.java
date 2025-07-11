package co.edu.udistrital.model.concreto;

import co.edu.udistrital.model.ProDocumento;

public class Pdf extends ProDocumento{

	@Override
	protected Object procesarContenido() {
		// TODO Auto-generated method stub
		return "Procesando Pdf con libreria especifica\n";
	}
	

}
