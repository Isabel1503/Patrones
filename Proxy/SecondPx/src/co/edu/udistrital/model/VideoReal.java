package co.edu.udistrital.model;

public class VideoReal implements Video{
	
	private String nombre;
	
	public VideoReal(String contenido) {
        this.nombre = contenido;
    }

	@Override
	public String descargar() {
		// TODO Auto-generated method stub
		return "Descargar video: " + nombre;
	}

}
