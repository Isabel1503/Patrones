package co.edu.udistrital.model;

public class ManejadorPagos {
	private MetodoPago metodo;//referencia a un metodo concreto que implementa la interface

	//Método que asigna un método de pago al ManejadorPagos
	public void setMetodo(MetodoPago metodo) {
		this.metodo = metodo;
	}
	
	//Método que permite delegar el pago al objeto si el user selecciono una opción
	public String procesarPago(double monto) {
		
		if(metodo != null) {
			return metodo.cancelar(monto);
		}else {
			return "Es necesario que seleccione el método de pago";
		}
			
	}
}

