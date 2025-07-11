package co.edu.udistrital.model;

public class Personaje {
	private int x, y; // Característica extrínseca
    private TipoPersonaje tipo; // Característica intrínseca

    public Personaje(int x, int y, TipoPersonaje tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public String mostrar() {
        return tipo.mostrar(x, y);
    }

}
