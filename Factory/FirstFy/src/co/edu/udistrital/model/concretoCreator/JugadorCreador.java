package co.edu.udistrital.model.concretoCreator;

import co.edu.udistrital.model.JugadorCasual;
import co.edu.udistrital.model.JugadorHardcore;
import co.edu.udistrital.model.JugadorIntermedio;
import co.edu.udistrital.model.JugadorProfesional;
import co.edu.udistrital.model.abstracto.Jugador;
import co.edu.udistrital.model.abstracto.JugadorFactory;

public class JugadorCreador implements JugadorFactory {

	@Override
	public Jugador crearTipoJugador(String apodo, int numjuego) {
		if(numjuego<= 3 ) {
			return new JugadorCasual(apodo,numjuego);
		}else if((numjuego > 3) && (numjuego <= 5)){
			return new JugadorIntermedio(apodo,numjuego);
			
		}else if((numjuego > 5) && (numjuego <= 9)){
			return new JugadorHardcore(apodo,numjuego);
		}else if(numjuego > 9){
			return new JugadorProfesional(apodo,numjuego);
		}
		return null;
	}

}
