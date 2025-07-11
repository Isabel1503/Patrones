package co.edu.udistrital.model.fabricaConcreta;

import co.edu.udistrital.model.Mensual;
import co.edu.udistrital.model.fabricaAbstracta.ServicioFactory;
import co.edu.udistrital.model.fabricaAbstracta.ServicioGanancia;

public class MensualConcreto implements ServicioFactory{

	@Override
	public ServicioGanancia crearGanancia() {
		return new Mensual();
	}
	

}
