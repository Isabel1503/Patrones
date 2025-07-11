package co.edu.udistrital.controller;

public class SerieReal implements Serie{
	
	private String nombre;
	
	public SerieReal(String contenido) {
        this.nombre = contenido;
    }

	@Override
	public String ver() {
		// TODO Auto-generated method stub
		return "Ver serie: " + nombre;
	}

}
