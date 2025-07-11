package co.edu.udistrital.model;

public class Carro {
	private int x, y; // Característica extrínseca
    private TipoCarro tipo; // Característica intrínseca

    public Carro(int x, int y, TipoCarro tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public String mostrar() {
        return tipo.mostrar(x, y);
    }

}
