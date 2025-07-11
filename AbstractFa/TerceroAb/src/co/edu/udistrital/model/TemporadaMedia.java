package co.edu.udistrital.model;

import co.edu.udistrital.model.fabricaAbstracta.ServicioPorcentaje;

public class TemporadaMedia implements ServicioPorcentaje  {

	@Override
	public double validarGanancia(double ganancia) {
		double porcentaje = 0.05;
		return ganancia * porcentaje;
	}


}
