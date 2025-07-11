package co.edu.udistrital.model;

public class Jugador {
	private Movimiento movimientoS; //referencia a un metodo concreto que implementa la interface

	//Método que asigna un movimiento al jugador
	public void setMovientoS(Movimiento movientoS) {
		this.movimientoS = movientoS;
	}
	
	//Método que permite delegar el movimiento al objeto si el user selecciono una opción
	public String mover() {
		if(movimientoS != null) {
			return movimientoS.mover();
			}else {
				return"No ha seleccionado movimiento";
			}
		}

}
