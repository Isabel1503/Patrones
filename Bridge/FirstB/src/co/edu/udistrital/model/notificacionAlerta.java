package co.edu.udistrital.model;

public class notificacionAlerta extends Notificacion{

	public notificacionAlerta(ICanalComunicacion canalcomunicacion) {
		super(canalcomunicacion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enviar(String mensaje) {
		canalcomunicacion.enviar(" ¡Alerta! " + mensaje);
		
	}
	
	

}
