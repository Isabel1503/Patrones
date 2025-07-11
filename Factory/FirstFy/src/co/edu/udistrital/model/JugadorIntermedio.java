package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Jugador;

public class JugadorIntermedio extends Jugador  {

	public JugadorIntermedio(String a, int h) {
		super(a, h);

	}

	@Override
	public String describir() {
		return "JUGADOR INTERMEDIO";
	}

	@Override
	public String AsignarBonus() {
		int x;
		String res;
		x = (HorasJuego * 10);
		res = Integer.toString(x);
		return "Ha ganado "+res+ " gemas";
	}

}
