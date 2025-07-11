package co.edu.udistrital.model.fabricaConcreta;

import co.edu.udistrital.model.TemporadaBaja;
import co.edu.udistrital.model.fabricaAbstracta.ServicioFactory;
import co.edu.udistrital.model.fabricaAbstracta.ServicioPorcentaje;

public class BajaConcreto implements ServicioFactory{

	@Override
	public ServicioPorcentaje crearPorcentaje() {
		return new TemporadaBaja();
	}

}
