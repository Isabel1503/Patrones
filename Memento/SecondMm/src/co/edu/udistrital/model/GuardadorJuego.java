package co.edu.udistrital.model;

public class GuardadorJuego {
	
	private final int nivel;
	private final int vidas;
	
	public GuardadorJuego(int nivel, int vidas) {
		this.nivel = nivel;
		this.vidas = vidas;
	}

	public int getNivel() {
		return nivel;
	}

	public int getVidas() {
		return vidas;
	}
	
	

}
