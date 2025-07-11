package co.edu.udistrital.model;

public class Arbol {
	private int x, y; // Característica extrínseca
    private TipoArbol tipo; // Característica intrínseca

    public Arbol(int x, int y, TipoArbol tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public String mostrar() {
        return tipo.mostrar(x, y);
    }

}
