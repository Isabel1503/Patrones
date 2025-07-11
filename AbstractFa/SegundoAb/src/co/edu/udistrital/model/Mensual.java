package co.edu.udistrital.model;

import co.edu.udistrital.model.fabricaAbstracta.ServicioGanancia;

public class Mensual implements ServicioGanancia{

	@Override
	public String validarIngresos() {
		return "El ingreso mensual es valido";
	}

	@Override
	public String validarGastos() {
		return "El gasto mensual es valido";
	}
	

}
