package co.edu.udistrital.model.frabricaConcreta;

import co.edu.udistrital.model.SegundaSemana;
import co.edu.udistrital.model.fabricaAbstracta.ServicioFactory;
import co.edu.udistrital.model.fabricaAbstracta.ServicioRutina;

public class SegundaConcreto implements ServicioFactory{

	@Override
	public ServicioRutina crearRutina() {
		return new SegundaSemana();
	}

}
