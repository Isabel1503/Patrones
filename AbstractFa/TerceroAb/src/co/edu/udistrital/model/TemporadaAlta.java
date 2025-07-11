package co.edu.udistrital.model;

import co.edu.udistrital.model.fabricaAbstracta.ServicioPorcentaje;

public class TemporadaAlta implements ServicioPorcentaje{

	@Override
	public double validarGanancia(double ganancia) {
		double porcentaje = 0.07;
		return ganancia * porcentaje;
	}

}
