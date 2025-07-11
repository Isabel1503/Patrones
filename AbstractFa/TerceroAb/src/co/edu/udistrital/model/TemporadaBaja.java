package co.edu.udistrital.model;

import co.edu.udistrital.model.fabricaAbstracta.ServicioPorcentaje;

public class TemporadaBaja implements ServicioPorcentaje{

	@Override
	public double validarGanancia(double ganancia) {
		double porcentaje =0.02;
		return ganancia *porcentaje;
	}


	

}
