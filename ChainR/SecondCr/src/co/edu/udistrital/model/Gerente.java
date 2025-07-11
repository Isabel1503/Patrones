package co.edu.udistrital.model;

public class Gerente extends PrestamoManejador {

	@Override
	public String procesarSolicitud(SolicitudPrestamo solicitud) {
		if (solicitud.getMonto() <= 1000) {
            return"Aprobado por Gerente (Monto: $" + solicitud.getMonto() + ")";
        } else if (siguienteManejador != null) {
            return siguienteManejador.procesarSolicitud(solicitud);
        } else {
            return("No hay siguiente manejador para la solicitud.");
        }
		
	}

}
