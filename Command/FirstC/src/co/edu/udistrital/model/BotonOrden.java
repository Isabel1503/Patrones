package co.edu.udistrital.model;

public class BotonOrden {
	private Orden orden;

	public void setOrden(Orden orden) {
		this.orden = orden;
	}
	
	public String presionar() {
		if(orden != null) {
			return orden.ejecutar();
		}else {
			return "Es necesario asignar una orde";
		}
	}

}
