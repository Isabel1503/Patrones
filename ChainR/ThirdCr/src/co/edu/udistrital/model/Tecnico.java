package co.edu.udistrital.model;

public class Tecnico extends ProblemaManejador{

	@Override
	public String procesarSolicitud(SolicitudProblema solicitud) {
		return(" El área técnica en un momento lo atendera(Escala" + solicitud.getEscala() + ")");
	}

	

	

}
