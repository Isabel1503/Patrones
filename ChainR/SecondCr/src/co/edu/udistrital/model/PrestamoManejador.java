package co.edu.udistrital.model;

public abstract class PrestamoManejador {
	protected PrestamoManejador siguienteManejador;

    public void setSiguienteManejador(PrestamoManejador siguiente) {
    	this.siguienteManejador = siguiente;
    }
    
    public abstract String procesarSolicitud(SolicitudPrestamo solicitud);

}
