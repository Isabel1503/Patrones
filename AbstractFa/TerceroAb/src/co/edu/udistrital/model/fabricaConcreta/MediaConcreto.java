package co.edu.udistrital.model.fabricaConcreta;

import co.edu.udistrital.model.TemporadaMedia;
import co.edu.udistrital.model.fabricaAbstracta.ServicioFactory;
import co.edu.udistrital.model.fabricaAbstracta.ServicioPorcentaje;

public class MediaConcreto implements ServicioFactory{

	@Override
	public ServicioPorcentaje crearPorcentaje() {
		return new TemporadaMedia();
	}
	

}
