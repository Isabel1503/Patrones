package co.edu.udistrital.model;

public class Boton {
	private Proceso proceso;
	
	public void setBoton(Proceso proceso) {
		this.proceso = proceso;
	}
	
	public String presionar() {
		if(proceso!= null) {
			return proceso.ejecutar();
		}else {
			return "Es necesario asignar una orde";
		}
	}

}
