package co.edu.udistrital.model;

public class Empleado  extends PrestamoManejador{

	@Override
	public String procesarSolicitud(SolicitudPrestamo solicitud) {
		if (solicitud.getMonto() <= 100) {
            return(" Aprobado por Empleado (Monto: $" + solicitud.getMonto() + ")");
        } else if (siguienteManejador != null) {
            return siguienteManejador.procesarSolicitud(solicitud);
        } else {
            return("No hay siguiente manejador para la solicitud.");
        }
    }
	
}

