package co.edu.udistrital.model;

public class Director extends PrestamoManejador{
	
	@Override
	public String procesarSolicitud(SolicitudPrestamo solicitud) {
		return(" Aprobado por Director (Monto: $" + solicitud.getMonto() + ")");
	}

	

	

}
