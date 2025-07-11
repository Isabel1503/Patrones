package co.edu.udistrital.model;

public class Director extends CompraManejador{

	@Override
	public String procesarSolicitud(SolicitudCompra solicitud) {
		return(" Aprobado por Director (Monto: $" + solicitud.getMonto() + ")");
	}

	

	

}
