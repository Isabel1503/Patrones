package co.edu.udistrital.model;

 import co.edu.udistrital.model.abstracto.Jugador;

public class JugadorCasual extends Jugador {

	public JugadorCasual(String apodo, int horasjuego) {
		super(apodo, horasjuego);
	}

	@Override
	public String describir() {
		
		return "JUGADOR CASUAL";
	}

	@Override
	public String AsignarBonus() {
		int x;
		String res;
		x = (HorasJuego * 5);
		res = Integer.toString(x);
		return "Ha ganado " +res + " gemas";
	}

}
