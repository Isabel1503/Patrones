package co.edu.udistrital.model;

import co.edu.udistrital.model.fabricaAbstracta.ServicioGanancia;

public class Semestral implements ServicioGanancia{

	@Override
	public String validarIngresos() {
		return "El ingreso semestral es valido";
	}

	@Override
	public String validarGastos() {
		return "El gasto semestral es valido";
	}
	

}
