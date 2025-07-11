package co.edu.udistrital.model;

import co.edu.udistrital.model.fabricaAbstracta.ServicioGanancia;

public class Anual implements ServicioGanancia{

	@Override
	public String validarIngresos() {
		return "El ingreso anual es valido";
	}

	@Override
	public String validarGastos() {
		return "El gasto anual es valido";
	}
	
	

}
