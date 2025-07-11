package co.edu.udistrital.model.fabricaConcreta;

import co.edu.udistrital.model.Semestral;
import co.edu.udistrital.model.fabricaAbstracta.ServicioFactory;
import co.edu.udistrital.model.fabricaAbstracta.ServicioGanancia;

public class SemestralConcreto implements ServicioFactory{

	@Override
	public ServicioGanancia crearGanancia() {
		return new Semestral();
	}
	

}
