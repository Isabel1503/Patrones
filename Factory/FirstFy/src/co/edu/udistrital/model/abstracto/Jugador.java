package co.edu.udistrital.model.abstracto;

public abstract class Jugador {
	protected String Apodo;
	protected int HorasJuego;
	
	
	public Jugador(String apodo,int horasjuego) {
		this.Apodo= apodo;
		this.HorasJuego= horasjuego;
	}

	public abstract String describir();
	public abstract String AsignarBonus();

}
