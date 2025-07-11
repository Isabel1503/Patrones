package co.edu.udistrital.model.frabricaConcreta;

import co.edu.udistrital.model.TerceraSemana;
import co.edu.udistrital.model.fabricaAbstracta.ServicioFactory;
import co.edu.udistrital.model.fabricaAbstracta.ServicioRutina;

public class TerceraConcreto implements ServicioFactory{

	@Override
	public ServicioRutina crearRutina() {
		return new TerceraSemana();
	}

}
