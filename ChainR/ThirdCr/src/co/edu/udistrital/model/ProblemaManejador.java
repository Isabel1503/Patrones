package co.edu.udistrital.model;

public abstract class ProblemaManejador {
	protected ProblemaManejador siguienteManejador;

    public void setSiguienteManejador(ProblemaManejador siguiente) {
    	this.siguienteManejador = siguiente;
    }
    
    public abstract String procesarSolicitud(SolicitudProblema solicitud);

}
