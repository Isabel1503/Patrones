package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Jugador;

public class JugadorProfesional extends Jugador {
	public JugadorProfesional(String a, int h) {
		super(a, h);

	}

	@Override
	public String describir() {
		return "JUGADOR PROFESIONAL";
	}

	@Override
	public String AsignarBonus() {
		int x;
		String res;
		x = (HorasJuego * 20);
		res = Integer.toString(x);
		return "Ha ganado "+res+ " gemas";
	}
	

}
