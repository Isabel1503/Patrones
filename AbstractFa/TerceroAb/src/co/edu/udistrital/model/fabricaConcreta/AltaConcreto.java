package co.edu.udistrital.model.fabricaConcreta;

import co.edu.udistrital.model.TemporadaAlta;
import co.edu.udistrital.model.fabricaAbstracta.ServicioFactory;
import co.edu.udistrital.model.fabricaAbstracta.ServicioPorcentaje;

public class AltaConcreto implements ServicioFactory{

	@Override
	public ServicioPorcentaje crearPorcentaje() {
		return new TemporadaAlta();
	}

}
