package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Jugador;

public class JugadorHardcore extends Jugador {
	public JugadorHardcore(String a, int h) {
		super(a, h);

	}

	@Override
	public String describir() {
		return "JUGADOR HARDCORE";
	}

	@Override
	public String AsignarBonus() {
		int x;
		String res;
		x = (HorasJuego * 15);
		res = Integer.toString(x);
		return "Ha ganado "+res+ " gemas";
	}


}
