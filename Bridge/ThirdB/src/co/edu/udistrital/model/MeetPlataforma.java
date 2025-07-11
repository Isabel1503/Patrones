package co.edu.udistrital.model;

import co.edu.udistrital.view.VistaConsola;

public class MeetPlataforma implements IPlataforma{
	private VistaConsola vista;
	
	public MeetPlataforma() {
		vista = new VistaConsola();
	}

	@Override
	public void programar(String fecha) {
		vista.mostrarInformacion("La runión se realizara vía Meet en el siguiente horario "+ fecha);
		
		
	}
	
	

}
