package co.edu.udistrital.model;

public class TransaccionPago extends Transaccion{
	
	public TransaccionPago(ICuenta cuenta) {
		super(cuenta);
	}

	@Override
	public void enviarD(String monto) {
		cuenta.enviarD("Pago por valor de $"+monto);
		
	}

}
