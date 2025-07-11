package co.edu.udistrital.model;

import co.edu.udistrital.view.VistaConsola;

public class emailCanalCom implements ICanalComunicacion{
	private VistaConsola vista;
	
	public emailCanalCom() {
		vista = new VistaConsola();
	}

	@Override
	public void enviar(String mensaje) {
		vista.mostrarInformacion("Mensaje via Email " + mensaje);
		
	}


}
