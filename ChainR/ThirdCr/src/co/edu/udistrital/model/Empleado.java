package co.edu.udistrital.model;

public class Empleado  extends ProblemaManejador{

	@Override
	public String procesarSolicitud(SolicitudProblema solicitud) {
		if (solicitud.getEscala() == 1) {
            return(" El área de call center en un momento lo atendera (Escala: " + solicitud.getEscala() + ")");
        } else if (siguienteManejador != null) {
            return siguienteManejador.procesarSolicitud(solicitud);
        } else {
            return("No hay siguiente manejador para la solicitud.");
        }
    }
	
}

