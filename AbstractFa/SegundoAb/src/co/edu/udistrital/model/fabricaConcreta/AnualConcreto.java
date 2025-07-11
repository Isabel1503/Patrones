package co.edu.udistrital.model.fabricaConcreta;

import co.edu.udistrital.model.Anual;
import co.edu.udistrital.model.fabricaAbstracta.ServicioFactory;
import co.edu.udistrital.model.fabricaAbstracta.ServicioGanancia;

public class AnualConcreto implements ServicioFactory{

	@Override
	public ServicioGanancia crearGanancia() {
		return new Anual();
	}
	

}
