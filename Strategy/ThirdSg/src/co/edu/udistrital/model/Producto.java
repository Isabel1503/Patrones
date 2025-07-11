package co.edu.udistrital.model;

public class Producto {
	
	private Descuento descuento;//referencia a la interface

	//Método que asigna un método de descuento al Producto
	public void setDescuento(Descuento descuento) {
		this.descuento = descuento;
	}
	
	//Este método calcula el monto final aplicando el descuento
	public double calcularMonto(double montoB) {
		
		return descuento.Descontar(montoB);
		
	}

}
