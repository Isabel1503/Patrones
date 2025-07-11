package co.edu.udistrital.model;

public class Soporte extends ProblemaManejador {

	@Override
	public String procesarSolicitud(SolicitudProblema solicitud) {
		if (solicitud.getEscala() == 5) {
            return"El área de soporte en un momento lo atendera  (Escala: " + solicitud.getEscala() + ")";
        } else if (siguienteManejador != null) {
            return siguienteManejador.procesarSolicitud(solicitud);
        } else {
            return("No hay siguiente manejador para la solicitud.");
        }
		
	}

}
