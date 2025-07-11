package co.edu.udistrital.model;

import co.edu.udistrital.view.VistaConsola;

public class TeamsPlataforma implements IPlataforma{
	private VistaConsola vista;
	
	public TeamsPlataforma() {
		vista = new VistaConsola();
	}

	@Override
	public void programar(String fecha) {
		vista.mostrarInformacion("La runión se realizara vía Teams en el siguiente horario"+fecha);
		
		
	}
	

}
