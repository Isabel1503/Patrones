package co.edu.udistrital.model;

import co.edu.udistrital.model.fabricaAbstracta.ServicioRutina;

public class TerceraSemana implements ServicioRutina {

	@Override
	public String validarobjetivo() {
		return "Objetivo validado";
	}

	@Override
	public String validarPeso() {
		return "Peso validado";
	}
	

}
