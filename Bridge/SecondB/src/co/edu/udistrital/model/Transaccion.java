package co.edu.udistrital.model;

//Esta clase representa lo que se desea hacer es decir un pago de dinero

public abstract class Transaccion {
	ICuenta cuenta;
	
	public Transaccion(ICuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	public abstract void enviarD(String monto);

}
