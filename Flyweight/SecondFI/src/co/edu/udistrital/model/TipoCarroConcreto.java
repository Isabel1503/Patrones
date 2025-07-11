package co.edu.udistrital.model;

public class TipoCarroConcreto implements TipoCarro{
	private String nombre;
    private String color;

    public TipoCarroConcreto(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
        //Características Intrínsecas que comparten los arboles
    }

	@Override
	public String mostrar(int x, int y) {
		return (" Carro tipo: " + nombre +
	            " | Color: " + color +
	            " | Posición: (" + x + ", " + y + ")");
		
	}

}
