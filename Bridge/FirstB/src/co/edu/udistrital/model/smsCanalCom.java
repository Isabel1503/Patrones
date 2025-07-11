package co.edu.udistrital.model;

import co.edu.udistrital.view.VistaConsola;

public class smsCanalCom implements ICanalComunicacion{
	private VistaConsola vista;
	
	public smsCanalCom() {
		vista = new VistaConsola();
	}

	@Override
	public void enviar(String mensaje) {
		vista.mostrarInformacion(" Mensaje via sms" + mensaje);
		
	}

}
