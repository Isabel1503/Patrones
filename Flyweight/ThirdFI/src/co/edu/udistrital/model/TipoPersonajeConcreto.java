package co.edu.udistrital.model;

public class TipoPersonajeConcreto implements TipoPersonaje{
	private String nombre;
    private String color;

    public TipoPersonajeConcreto(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
        //Características Intrínsecas que comparten los arboles
    }

	@Override
	public String mostrar(int x, int y) {
		return (" Personaje tipo: " + nombre +
	            " | Color: " + color +
	            " | Posición: (" + x + ", " + y + ")");
		
	}

}
