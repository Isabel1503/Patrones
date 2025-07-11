package co.edu.udistrital.model.concreto;

import co.edu.udistrital.model.Movimiento;

public class Caminar implements Movimiento{


	//Método que se encarga del movimiento caminar
	@Override
	public String mover() {

		return "Mario está caminando \n";
	}

}
