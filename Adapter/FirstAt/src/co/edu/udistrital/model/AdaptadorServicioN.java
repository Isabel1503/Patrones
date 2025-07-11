package co.edu.udistrital.model;

//Esta clase adapta servicioN para que cumpla con la interface guardador
public class AdaptadorServicioN implements Guardador{
	private ServicioNube servicio;
	
	//El constructor recibe una instancia de ServicioNube
	public AdaptadorServicioN(ServicioNube servicio) {
		this.servicio = servicio;
	}

	@Override
	public String guardar(String datos) {
		
		//Adapta el metodo guardar para usar subir
		return servicio.subir(datos);
		
	}

}
