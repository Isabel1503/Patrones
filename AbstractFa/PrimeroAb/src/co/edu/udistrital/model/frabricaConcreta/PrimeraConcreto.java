package co.edu.udistrital.model.frabricaConcreta;

import co.edu.udistrital.model.PrimeraSemana;
import co.edu.udistrital.model.fabricaAbstracta.ServicioFactory;
import co.edu.udistrital.model.fabricaAbstracta.ServicioRutina;

public class PrimeraConcreto implements ServicioFactory{

	@Override
	public ServicioRutina crearRutina() {
		return new PrimeraSemana();
	}
	

}

