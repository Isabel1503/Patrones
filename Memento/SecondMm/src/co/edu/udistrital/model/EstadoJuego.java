package co.edu.udistrital.model;

public class EstadoJuego {
	private int nivel;
	private int vidas;
	
	public void jugarNivel(int nivel, int vidas) {
        this.nivel = nivel;
        this.vidas = vidas;
    }

    public GuardadorJuego guardar() {
        return new GuardadorJuego(nivel, vidas);
    }

    public void cargar(GuardadorJuego save) {
        this.nivel = save.getNivel();
        this.vidas = save.getVidas();
    }

    public String mostrar() {
        return("Nivel: " + nivel + " | Vidas: " + vidas);
    }
	

}
