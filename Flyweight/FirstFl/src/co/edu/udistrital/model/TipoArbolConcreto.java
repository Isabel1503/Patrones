package co.edu.udistrital.model;

public class TipoArbolConcreto implements TipoArbol{
	private String nombre;
    private String color;
    private String textura;

    public TipoArbolConcreto(String nombre, String color, String textura) {
        this.nombre = nombre;
        this.color = color;
        this.textura = textura;
        //Características Intrínsecas que comparten los arboles
    }

	@Override
	public String mostrar(int x, int y) {
		return ("Árbol tipo: " + nombre +
	            " | Color: " + color +
	            " | Textura: " + textura +
	            " | Posición: (" + x + ", " + y + ")");
		
	}

}
