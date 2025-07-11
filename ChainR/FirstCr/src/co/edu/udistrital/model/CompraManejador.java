package co.edu.udistrital.model;

public abstract class CompraManejador {
	protected CompraManejador siguienteManejador;

    public void setSiguienteManejador(CompraManejador siguiente) {
    	this.siguienteManejador = siguiente;
    }
    
    public abstract String procesarSolicitud(SolicitudCompra solicitud);

}
